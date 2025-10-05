package main.java.com.demo_01.demo_01.pojo;
import java.lang.annotation.Inherited;
import javax.annotation.processing.Generated;

@Table(name = "tb_demo_01")
@Entity
public class User {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name="user_id")
  private Integer userID;
  @Column(name="user_name")
  private String userName;
  @Column(name="password")
  private String password;
  @Column(name="email")
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
    return "User [userID=" + userID + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
  }

}
