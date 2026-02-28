package com.rou.taskmanager.service;

import com.rou.taskmanager.model.Task;
import com.rou.taskmanager.model.User;
import com.rou.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService{

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<Task> getTasksForUser(User user){
        return taskRepository.findByUser(user);
    }

    public Task addTask(Task task, User user){
        task.setUser(user);
        return taskRepository.save(task);
    }
    
}
