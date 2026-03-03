package com.rou.taskmanager.controller;

import com.rou.taskmanager.model.Task;
import com.rou.taskmanager.model.User;
import com.rou.taskmanager.service.TaskService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }
    @GetMapping
    public List<Task> getTasksForUser(@AuthenticationPrincipal User user){
        return taskService.getTasksForUser(user);
    }
}
