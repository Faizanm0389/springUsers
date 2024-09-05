package com.example.myProj.Service;


import com.example.myProj.Model.User;
import com.example.myProj.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Method to return all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Method to return name given an id
    public String getNameById(int id) {
        Optional<User> userOpt = userRepository.findById(id);
        return userOpt.map(User::getName).orElse("Not found");
    }
}
