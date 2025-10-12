package com.liu.demo01_liu.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Hello {
  
  @GetMapping("/hello")
  public String getMethodName(String nickname, String phone) {
    System.out.println(phone);
    return "Hello World" + nickname;
  }
  
}
