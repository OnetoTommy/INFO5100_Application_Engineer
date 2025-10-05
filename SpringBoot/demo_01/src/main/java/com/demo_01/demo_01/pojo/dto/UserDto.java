package main.java.com.demo_01.demo_01.pojo.dto;

public class UserDto {

  private Integer userID;
  @NotBlank(message = "用户名不能为空")
  private String userName;
  @NotBlank(message = "用户名不能为空")
  @Length(min=6, max=12)
  private String password;
  @NotBlank(message = "用户名不能为空")
  private String email;
  public Integer getUserID() {
    return userID;
  }
  public void setUserID(Integer userID) {
    this.userID = userID;
  }
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "UserDto [userID=" + userID + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
  }
}
