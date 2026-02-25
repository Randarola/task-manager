package com.rou.taskmanager.controller;

import com.rou.taskmanager.model.User;
import com.rou.taskmanager.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    public UserController (UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List <User> getUsers(){
        return userService.getUsers();
    }
    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
