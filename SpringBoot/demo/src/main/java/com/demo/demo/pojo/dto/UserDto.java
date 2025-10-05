package com.demo.demo.pojo.dto;

import org.hibernate.validator.constraints.Length;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserDto {
  private Integer userId;
  @NotBlank(message = "用户名不能为空")
  private String userName;
  @NotBlank(message = "用户名不能为空")
  @Length(min= 6, max = 12)
  private String passWord;
  @Email(message = "email格式不正确")
  private String email;

  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public String getPassWord() {
    return passWord;
  }
  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  
  public Integer getUserId() {
    return userId;
  }
  @Override
  public String toString() {
    return "UserDto [userId=" + userId + ", userName=" + userName + ", passWord=" + passWord + ", email=" + email + "]";
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }
}
