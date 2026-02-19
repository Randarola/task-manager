package com.rou.task_manager.repository;

import com.rou.task_manager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Integer>{
    Optional<User> findByUsername(String username);
}
