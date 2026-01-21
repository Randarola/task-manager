package com.rou.task_manager.controller;

import com.rou.task_manager.model.User;
import com.rou.task_manager.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private final UserRepository userRepository;
    public UserController (UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @GetMapping("/users")
    public List <User> getUsers(){
        return userRepository.findAll();
    }
}
