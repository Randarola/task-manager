package com.rou.taskmanager.service;

import com.rou.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService{

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
}
