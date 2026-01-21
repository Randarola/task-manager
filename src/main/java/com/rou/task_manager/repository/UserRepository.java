package com.rou.task_manager.repository;

import com.rou.task_manager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer>{
}
