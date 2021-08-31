/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.service;

import com.app.entity.UserFiles;
import com.app.entity.Users;
import com.app.exception.FileNotFoundException;
import com.app.exception.FileStorageException;
import com.app.repos.FilesRepository;

import java.io.*;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.servlet.ServletContext;
import org.springframework.util.FileSystemUtils;

@Service
public class FileStorageService  implements  FileStorageServiceInter {

    @Autowired
    FilesRepository repository;
    @Autowired
    ServletContext context;

    Logger logger;

    @Override
    public Path checkDir(Users user) {
        try {
            Path fileStorageLocation = Paths.get("./uploads/" + user.getLogin()).toAbsolutePath().normalize();
            //System.out.println(fileStorageLocation.toAbsolutePath().normalize());
            Files.createDirectories(fileStorageLocation);
            return fileStorageLocation;
        } catch (Exception ex) {
            throw new FileStorageException("Could not create the directory where the uploaded files will be stored.", ex);
        }

    }

    // один файл!!!
    @Override
    public String storeFile(MultipartFile file, Users user) {
        // Normalize file name
        String originalFileName = StringUtils.cleanPath(file.getOriginalFilename());
        String uuid = UUID.randomUUID().toString();
        String extension = FilenameUtils.getExtension(originalFileName);
        String fileName = uuid + "." + extension.toLowerCase();

        try {
            // Check if the file's name contains invalid characters
            if (fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

            // Copy file to the target location (Replacing existing file with the same name)
            Path targetLocation = checkDir(user).resolve(fileName);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
            UserFiles userFile = new UserFiles(uuid, originalFileName, user);
            userFile.setPath(targetLocation.toString());
            userFile.setFileSize(targetLocation.toFile().length());
            repository.save(userFile);
            return fileName;
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }

    }

    // если несколько файлов - то в zip
    public String storeFiles(MultipartFile[] files, Users user) {
        String uuidTemp = UUID.randomUUID().toString();
        String uuid = UUID.randomUUID().toString();
        String fileName="multiCompressed.zip";
        int fileCount = files.length;
        try {
            Path tempDir = Paths.get("./uploads/" + uuidTemp).toAbsolutePath().normalize();
            Files.createDirectories(tempDir);
            Path targetLocation = checkDir(user).resolve(uuid+".zip");
            FileOutputStream fos = new FileOutputStream(targetLocation.toString());
            ZipOutputStream zipOut = new ZipOutputStream(fos);
            for (MultipartFile file : files) {
                String originalFileName = StringUtils.cleanPath(file.getOriginalFilename());
                Path targetLocationF = tempDir.resolve(originalFileName);
                Files.copy(file.getInputStream(), targetLocationF, StandardCopyOption.REPLACE_EXISTING);
                FileInputStream fis = new FileInputStream(targetLocationF.toFile());
                ZipEntry zipEntry = new ZipEntry(originalFileName);
                zipOut.putNextEntry(zipEntry);
                byte[] bytes = new byte[1024];
                int length;
                while ((length = fis.read(bytes)) >= 0) {
                    zipOut.write(bytes, 0, length);
                }
                fis.close();

            }
            zipOut.close();
            fos.close();

            UserFiles userFile = new UserFiles(uuid, fileName, user);
            userFile.setPath(targetLocation.toString());
            userFile.setFileCount(fileCount);
            userFile.setFileSize(targetLocation.toFile().length());
            repository.save(userFile);
            FileSystemUtils.deleteRecursively(tempDir);
            return fileName;
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

    @Override
    public Resource loadFileAsResource(String fileName, Users user) {
        try {
            Path filePath = checkDir(user).resolve(fileName).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            if (resource.exists()) {
                return resource;
            } else {
                throw new FileNotFoundException("File not found " + fileName);
            }
        } catch (MalformedURLException ex) {
            throw new FileNotFoundException("File not found " + fileName, ex);
        }

    }

    @Override
    public Resource loadFileAsResource(String fileName) {
        try {
            Path filePath = Paths.get(fileName).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            if (resource.exists()) {
                return resource;
            } else {
                throw new FileNotFoundException("File not found " + fileName);
            }
        } catch (MalformedURLException ex) {
            throw new FileNotFoundException("File not found " + fileName, ex);
        }

    }

    @Override
    public void deleteResource(String fileName) {

        if (fileName != null) {
            Path filePath = Paths.get(fileName).normalize(); // .normalize  удаляет все повторяющиеся элементы пути!!
            try {

                FileUtils.forceDelete(filePath.toFile());


            } catch (IOException e) {

                e.printStackTrace();
            }
        }

    }

    public String storeFilesZip(String filePath, Users user) {

        String uuidTemp = UUID.randomUUID().toString();

        String uuid = UUID.randomUUID().toString();



        String fileName = uuid + ".zip";

        int fileCount = 1;

        try {

            Path tempDir = Paths.get("./uploads/" + uuidTemp).toAbsolutePath().normalize();

            Files.createDirectories(tempDir);

            Path targetLocation = checkDir(user).resolve(uuid + ".zip");

            FileOutputStream fos = new FileOutputStream(targetLocation.toString());

            ZipOutputStream zipOut = new ZipOutputStream(fos);

            File file = new File(filePath);

            String originalFileName = StringUtils.cleanPath(file.getName());

            Path targetLocationF = tempDir.resolve(originalFileName);

            InputStream targetStream = new FileInputStream(file);

            Files.copy(targetStream, targetLocationF, StandardCopyOption.REPLACE_EXISTING);

            FileInputStream fis = new FileInputStream(targetLocationF.toFile());

            ZipEntry zipEntry = new ZipEntry(originalFileName);

            zipOut.putNextEntry(zipEntry);

            byte[] bytes = new byte[1024];

            int length;

            while ((length = fis.read(bytes)) >= 0) {

                zipOut.write(bytes, 0, length);

            }

            fis.close();



            zipOut.close();

            fos.close();



            UserFiles userFile = new UserFiles(uuid, fileName, user);

            userFile.setPath(targetLocation.toString());

            userFile.setFileCount(fileCount);

            userFile.setFileSize(targetLocation.toFile().length());

            repository.save(userFile);

            FileSystemUtils.deleteRecursively(tempDir);

            return fileName;

        } catch (IOException ex) {

            ex.printStackTrace();

            System.out.println(ex.getMessage());

            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);

        }

    }


}