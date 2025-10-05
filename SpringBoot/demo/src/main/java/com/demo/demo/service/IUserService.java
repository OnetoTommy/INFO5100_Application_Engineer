package com.demo.demo.service;

import com.demo.demo.pojo.User;
import com.demo.demo.pojo.dto.UserDto;

public interface IUserService {
  //@param user 参数传入
  User add(UserDto user);
  //用户ID
  User getUser(Integer userId);
  //edit user
  User edit(UserDto user);
  // delete
  void delete(Integer userId);
  
}
