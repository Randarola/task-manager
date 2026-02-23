package com.rou.task_manager.init;

import com.rou.task_manager.model.Role;
import com.rou.task_manager.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final PasswordEncoder passwordEncoder;
    public DataLoader(PasswordEncoder passwordEncoder){
        this.passwordEncoder = passwordEncoder;
    }
    @Override
    public void run(String... args) throws Exception {
        User admin = new User("admin","admin@gmail.com",passwordEncoder.encode("admin123"), Role.ADMIN);
    }
}
