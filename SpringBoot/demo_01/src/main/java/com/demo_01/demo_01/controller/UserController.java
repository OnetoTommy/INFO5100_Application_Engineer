package main.java.com.demo_01.demo_01.controller;

import main.java.com.demo_01.demo_01.pojo.ResponseMessage;
import main.java.com.demo_01.demo_01.pojo.dto.UserDto;
import main.java.com.demo_01.demo_01.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
  
  @Autowired
  IUserService userService;

  @PostMapping
  public ResponseMessage post(@Validated @RequestBody UserDto user){
    User userNew = userService.add(user);
    return ResponseMessage.success(userNew);
  }


  @GetMapping


  @PutMapping


  @DeleteMapping("{/{userId}}")
  
}
