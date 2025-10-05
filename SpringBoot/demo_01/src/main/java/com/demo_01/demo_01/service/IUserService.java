package main.java.com.demo_01.demo_01.service;

import main.java.com.demo_01.demo_01.pojo.User;
import main.java.com.demo_01.demo_01.pojo.dto.UserDto;

public interface IUserService {

  // add
  User add(UserDto user);

  // get
  User get(UserDto user);

  // edit
  User edit(UserDto user);

  // Delete
  User delete(UserDto user);
  
} 
