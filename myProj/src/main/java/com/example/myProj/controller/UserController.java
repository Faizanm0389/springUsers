package com.example.myProj.controller;

import com.example.myProj.Model.User;
import com.example.myProj.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping() // Correct base path
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/name/{id}")
    public String getNameById(@PathVariable int id) {
        return userService.getNameById(id);
    }
}
