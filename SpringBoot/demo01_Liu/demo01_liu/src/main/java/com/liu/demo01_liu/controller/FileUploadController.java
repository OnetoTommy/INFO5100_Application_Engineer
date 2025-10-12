package com.liu.demo01_liu.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import jakarta.servlet.http.HttpServletRequest;

import java.io.File;
import java.io.IOException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class FileUploadController {

  @PostMapping("/upload")
  public String postMethodName(String nickname, MultipartFile photo, HttpServletRequest request) throws IOException{
      //TODO: process POST request
      System.out.println(nickname);
      System.out.println("file size:" + photo.getSize());
      System.out.println(photo.getOriginalFilename());
      System.out.println(photo.getContentType());
      String path = request.getServletContext().getRealPath("/upload/");
      System.out.println(path);
      saveFile(photo, path);
      return "Successful to upload file";
  }

  public void saveFile(MultipartFile photo, String path) throws IOException{

    File dir = new File(path);
    if(!dir.exists()){
      dir.mkdir();
    }
    File file = new File(path+photo.getOriginalFilename());
    photo.transferTo(file);
  }
  
  
}
