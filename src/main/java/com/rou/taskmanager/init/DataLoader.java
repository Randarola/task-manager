package com.rou.taskmanager.init;

import com.rou.taskmanager.model.Role;
import com.rou.taskmanager.model.Task;
import com.rou.taskmanager.model.User;
import com.rou.taskmanager.repository.TaskRepository;
import com.rou.taskmanager.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final TaskRepository taskRepository;

    public DataLoader(PasswordEncoder passwordEncoder, UserRepository userRepository, TaskRepository taskRepository){
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.taskRepository = taskRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count() == 0) {
            User admin = new User("admin", "admin@gmail.com", passwordEncoder.encode("admin123"), Role.ADMIN);
            User user = new User("user", "user@gmail.com", passwordEncoder.encode("user123"), Role.USER);
            userRepository.saveAll(List.of(admin, user));

        }
    }
}
