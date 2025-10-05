package com.demo.demo.service;
import com.demo.demo.pojo.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.demo.pojo.dto.UserDto;
import com.demo.demo.repository.UserRepository;

@Service // spring bean
public class UserService implements IUserService{
  @Autowired
  UserRepository userResitory;

  @Override
  public User add(UserDto user){

    User userPojo = new User();
    BeanUtils.copyProperties(user, userPojo);
    return userResitory.save(userPojo);
  }

  @Override
  public User getUser(Integer userId) {
    // TODO Auto-generated method stub
    userResitory.findById(userId).orElseThrow(() -> {
      throw new IllegalArgumentException("参数异常");
    });
    throw new UnsupportedOperationException("Unimplemented method 'getUser'");
  }

  @Override
  public User edit(UserDto user) {
    // TODO Auto-generated method stub
    User userPojo = new User();
    BeanUtils.copyProperties(user, userPojo);
    return userResitory.save(userPojo);
  }

    @Override
  public void delete(Integer userId) {
    // TODO Auto-generated method stub
    
    userResitory.deleteById(userId);
  }
  
}
