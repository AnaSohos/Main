package com.app.service;

import com.app.entity.Users;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;

public interface FileStorageServiceInter {

    Path checkDir(Users user);

    String storeFile(MultipartFile file, Users user);

    String storeFiles(MultipartFile[] files, Users user);

    Resource loadFileAsResource(String fileName, Users user);

    Resource loadFileAsResource(String fileName);

    void deleteResource(String fileName);

    String storeFilesZip(String filePath, Users user);



}
