package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPrintService {

    public User addUser(User user) {
        System.out.println(user);

        return user;

    }
    public List<User> getAllUsers() {
        System.out.println("retreving users from aws" );
        return null;
    }
}
