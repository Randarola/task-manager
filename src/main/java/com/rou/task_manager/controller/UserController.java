package com.rou.task_manager.controller;

import com.rou.task_manager.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> users= new ArrayList<>();
        users.add(new User(1,"admin","admin","<EMAIL>"));
        users.add(new User(2,"user1","user","<EMAIL>"));
        users.add(new User(3,"user2","user2","<EMAIL>"));
        return users;
    }
}
