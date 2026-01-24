package com.rou.task_manager.controller;

import com.rou.task_manager.model.User;
import com.rou.task_manager.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;
    public UserController (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping
    public List <User> getUsers(){
        return userRepository.findAll();
    }
    @PostMapping
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }
}
