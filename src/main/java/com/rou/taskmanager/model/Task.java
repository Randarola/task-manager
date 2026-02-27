package com.rou.taskmanager.model;

import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Task(){
    }

    public Task(String title, String description, User user){
        this.title = title;
        this.description = description;
        this.user = user;
    }

}
