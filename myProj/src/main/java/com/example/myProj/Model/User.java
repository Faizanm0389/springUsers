package com.example.myProj.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    private int id;
    private String name;
    private int age;

    // Default Constructor (Required by JPA)
    public User() {}

    // Parameterized Constructor
    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    // It's good practice to let the database generate the ID,
    // but since we're initializing it manually, we include a setter.
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
