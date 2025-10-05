package main.java.com.demo_01.demo_01.service;

import main.java.com.demo_01.demo_01.pojo.User;
import main.java.com.demo_01.demo_01.pojo.dto.UserDto;
import main.java.com.demo_01.demo_01.repository.UserReposity;

@Service
public class UserService implements IUserService{
  @Autowired
  UserReposity userReposity;

  @Override
  public User add(UserDto user){
    User userPojo = new User();
    BeanUtils.copyProperties(user, userPojo);
    return userReposity.save(userPojo);
  }


}
