package com.demo.demo.controller;
import com.demo.demo.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.demo.pojo.ResponseMessage;
import com.demo.demo.pojo.dto.UserDto;
import com.demo.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


@RestController //接口方法返回对象，转换成json文本
@RequestMapping("/user")   //localhost:8088/user/**

public class UserController {

  @Autowired
  IUserService userService;

  //add
  @PostMapping     //url localhost:8088/user
  public ResponseMessage postMethodName(@Validated @RequestBody UserDto user) {
      //TODO: process POST request
    User userNew = userService.add(user);
    return ResponseMessage.success(userNew);
  }

  // query
  @GetMapping("/{userId}")  //URL: localhost:8088/user/1
  public ResponseMessage getMethodName(@PathVariable Integer userId) {
    User userNew = userService.getUser(userId);
      return ResponseMessage.success(userNew);
  }
  


  //modify
  @PutMapping("path/{id}")
  public ResponseMessage edit(@Validated @RequestBody UserDto user) {
      //TODO: process POST request
    User userNew = userService.edit(user);
    return ResponseMessage.success(userNew);
  }


  //delete
  @DeleteMapping("/{userId}")
  public ResponseMessage delete(@PathVariable Integer userId){
    userService.delete(userId);
    return ResponseMessage.success(null);
  }
  
}
