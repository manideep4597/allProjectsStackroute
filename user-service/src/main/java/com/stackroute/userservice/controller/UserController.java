package com.stackroute.userservice.controller;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.service.UserService;
import com.stackroute.userservice.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("api/v1")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("user")
    public ResponseEntity<?>  saveUser(@RequestBody User user) {
        User savedUser =userService.addUser(user);
        ResponseEntity responseEntity =new ResponseEntity<User>(savedUser, HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("users")
    public ResponseEntity<?> getAllUsers() {
        List <User> listUsers = userService.getAllUsers();
        ResponseEntity responseEntity =new ResponseEntity<List<User>>(listUsers, HttpStatus.OK);
        return responseEntity;

    }
}
