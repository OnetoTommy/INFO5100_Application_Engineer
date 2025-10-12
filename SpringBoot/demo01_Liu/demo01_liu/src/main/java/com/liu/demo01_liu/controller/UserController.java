package com.liu.demo01_liu.controller;

import org.springframework.web.bind.annotation.RestController;
import com.liu.demo01_liu.Entity.User;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class UserController {
  
  @GetMapping("/user/{id}")
  public String getMethodName(@PathVariable int id) {
    System.out.println(id);
      return "Get user information";
  }

  @PostMapping("/user")
  public String postMethodName(User user) {
      //TODO: process POST request
      return "User";
  }
  
  @PutMapping("/user")
  public String putMethodName(User user) {
      //TODO: process PUT request
      return "User";
  }

  @DeleteMapping("/user/{id}")
  public String deStringById(@PathVariable int id){
    System.out.println(id);
    return "Delete by id";
  }

  
}
