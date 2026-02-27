package com.rou.taskmanager.repository;

import com.rou.taskmanager.model.Task;
import com.rou.taskmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository <Task, Integer> {
    List<Task> findByUser(User user);
}
