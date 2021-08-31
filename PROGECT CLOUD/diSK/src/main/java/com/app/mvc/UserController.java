/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.mvc;

import com.app.entity.Links;
import com.app.entity.UserFiles;
import com.app.entity.Users;
import com.app.form.PasswordForm;
import com.app.repos.FilesRepository;
import com.app.repos.LinksRepository;
import com.app.repos.UsersRepository;
import com.app.service.FileStorageService;
import com.app.service.UsersService;

import java.io.*;
import java.security.Principal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Root
 */
@Controller
public class UserController {

    @Autowired
    UsersRepository usersRepository;
    @Autowired
    FilesRepository filesRepository;
    @Autowired
    LinksRepository linkRepository;

    @Autowired
    UsersService usersService;

    @Autowired
    FileStorageService fileStorage;

    int inPage = 25;

    @RequestMapping(value = "/cabinet/files", method = RequestMethod.GET)
    public String files(@RequestParam(name = "page", required = false, defaultValue = "0") int page, Model model, Principal principal) {
        if (page < 1) {
            page = 1;
        }
        int prev = page;
        if (prev > 1) {
            prev--;
            model.addAttribute("prev", prev);
        }
        int next = page;
        next++;
        model.addAttribute("next", next);
        model.addAttribute("page", page);
        Users user = usersRepository.findByLogin(principal.getName());

        Pageable pageReq = PageRequest.of(page - 1, 25, Sort.by("createDate").descending().and(Sort.by("name")));
        List<UserFiles> files = filesRepository.findAllByUser(user, pageReq);
        model.addAttribute("files", files);
        return "cabinet/files";
    }


    @RequestMapping(value = "/cabinet", method = RequestMethod.GET)
    public String index(@RequestParam(name = "page", required = false, defaultValue = "0") int page, Model model, Principal principal) {
        if (page < 1) {
            page = 1;
        }
        int prev = page;
        if (prev > 1) {
            prev--;
            model.addAttribute("prev", prev);
        }
        int next = page;
        next++;
        model.addAttribute("next", next);
        model.addAttribute("page", page);
        Users user = usersRepository.findByLogin(principal.getName());

        Pageable pageReq = PageRequest.of(page - 1, 25, Sort.by("createDate").descending().and(Sort.by("name")));
        List<UserFiles> files = filesRepository.findAllByUser(user, pageReq);
        model.addAttribute("files", files);
        return "cabinet/index";
    }

    @RequestMapping(value = "/cabinet/links", method = RequestMethod.GET)
    public String links(@RequestParam(name = "page", required = false, defaultValue = "0") int page, Model model, Principal principal) {
        if (page < 1) {
            page = 1;
        }
        int prev = page;
        if (prev > 1) {
            prev--;
            model.addAttribute("prev", prev);
        }
        int next = page;
        next++;
        model.addAttribute("next", next);
        model.addAttribute("page", page);
        Users user = usersRepository.findByLogin(principal.getName());

        Pageable pageReq = PageRequest.of(page - 1, 25, Sort.by("createTime").descending());
        List<Links> links = linkRepository.findAllByUser(user, pageReq);
        model.addAttribute("links", links);
        return "cabinet/links";
    }

    /*@RequestMapping(value = "/cabinet", method = RequestMethod.GET)
    public String index(Model model, Principal principal) {

        return "cabinet/index";
    }
*/
    @PostMapping("/cabinet/uploads")
    public String submit(
            @RequestParam MultipartFile[] files, Model model, Principal principal) {
        Users user = usersRepository.findByLogin(principal.getName());
        try {
            if (files.length == 1) {
                fileStorage.storeFile(files[0], user);
            } else {
                fileStorage.storeFiles(files, user);
            }

        } catch (Exception e) {
        }

        return "redirect:/cabinet/files";
    }
///  Optional попытаться получить объект  из кэша
//Если кэш вернул null, то вызвать метод findOneById у объекта-делегата

    @GetMapping("/cabinet/file/{uuid}")
    public ResponseEntity<Resource> getFile(@PathVariable String uuid) {
        Optional<UserFiles> userFile = filesRepository.findById(uuid);
        // действие если обьект не пустой
        if (userFile.isPresent()) {
            String fileName = userFile.get().getPath();
            Resource file = fileStorage.loadFileAsResource(fileName);
            ContentDisposition contentDisposition = ContentDisposition.builder("inline")
                    .filename(userFile.get().getName())
                    .build();

            String fileNameSend = userFile.get().getName();
            try {
                fileNameSend = new String(userFile.get().getName().getBytes("utf-8"), "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileNameSend).body(file);

        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @GetMapping("/link/{uuid}")
    public ResponseEntity<Resource> getLink(@PathVariable String uuid) {
        System.out.println(uuid);
        Optional<Links> link = linkRepository.findById(uuid);
        if (link.isPresent()) {
            String fileName = link.get().getFile().getPath();
            String fileNameSend = link.get().getFile().getName();
            try {
                fileNameSend = new String(link.get().getFile().getName().getBytes("utf-8"), "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            Resource file = fileStorage.loadFileAsResource(fileName);
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileNameSend + "\"").body(file);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @GetMapping("/cabinet/link/{uuid}")
    public String createLink(@PathVariable String uuid, Model model, Principal principal, HttpServletRequest request) {
        Users user = usersRepository.findByLogin(principal.getName());
        Optional<UserFiles> userFile = filesRepository.findById(uuid);
        if (userFile.isPresent()) {
            UserFiles file = userFile.get();
            String uuidLink = UUID.randomUUID().toString().replace("-", "");
            Links link = new Links(uuidLink);
            String url = getBaseUrl(request) + "\\link\\" + uuidLink;
            link.setFile(file);
            link.setUser(user);

            link.setLink(url);
            link = linkRepository.save(link);
            model.addAttribute("link", link);
            return "/cabinet/link";


        }
        return "redirect:/cabinet/files";
    }

    String getBaseUrl(HttpServletRequest req) {
        return req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + req.getContextPath();
    }


    @GetMapping("/cabinet/del/file/{uuid}")
    public String delFile(@PathVariable String uuid) {
        Optional<UserFiles> userFile = filesRepository.findById(uuid);
        if (userFile.isPresent()) {
            String file = userFile.get().getPath();
            List<Links> links = userFile.get().getLinks();
            for (int i = 0; i < links.size(); i++) {
                linkRepository.delete(links.get(i));
            }
            fileStorage.deleteResource(file);
            filesRepository.deleteById(uuid);
        }
        return "redirect:/cabinet/files";
    }

    @GetMapping("/cabinet/zip/file/{uuid}")
    public String zipFile(@PathVariable String uuid, Principal principal ) throws IOException {
       Users user = usersRepository.findByLogin(principal.getName());
        Optional<UserFiles> userFile = filesRepository.findById(uuid);
        if (userFile.isPresent())
            if (userFile.isPresent()) {
             String filez = userFile.get().getPath();
                Resource file = fileStorage.loadFileAsResource( filez );

            FileOutputStream fout = new FileOutputStream("./uploads/file.zip");
            ZipOutputStream zout = new ZipOutputStream(fout);

            ZipEntry ze = new ZipEntry(filez);
            zout.putNextEntry(ze);

            zout.closeEntry();
            zout.close();
            fileStorage.storeFilesZip(uuid, user);

        }


        return "redirect:/cabinet/files";
    }
    @GetMapping("/cabinet/del/link/{uuid}")
    public String delLinks(@PathVariable String uuid) {
        Optional<Links> link = linkRepository.findById(uuid);
        if (link.isPresent()) {
            linkRepository.delete(link.get());
        }
        return "redirect:/cabinet/links";
    }

     @RequestMapping(value = "/cabinet/resetPassword", method = RequestMethod.GET)
    public String ressetPassword(Model model, Principal principal) {
        String login = principal.getName();
        PasswordForm form = new PasswordForm(login);
        model.addAttribute("passForm", form);
        return "/cabinet/resetPassword";
    }

    @RequestMapping(value = "/cabinet/resetPassword", method = RequestMethod.POST)
    public String ressetingPassword(Model model, //
            @ModelAttribute("passForm") @Validated PasswordForm passForm, //
            BindingResult result, //
            final RedirectAttributes redirectAttributes) {
        // Validate result
        if (result.hasErrors()) {
            return "/cabinet/resetPassword";
        }
        String error = usersService.resetPassword(passForm.getLogin(), passForm.getPassword());
        if (error != null && !error.isEmpty()) {
            model.addAttribute("errorMessage", error);
            return "resetPassword";
        }
        return "redirect:/logout";
    }


}
