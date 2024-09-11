package com.example.event_management.service;
import com.example.event_management.repository.UserRepository; // It allows UserService to interact with the MongoDB database through the repository methods defined in UserRepository
import com.example.event_management.userservice.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    // Retrieve a user by ID
    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    // Delete a user by ID
    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }

    // Check if a user exists by username
    public boolean userExistsByUsername(String username) {
        return userRepository.findByUsername(username) != null;
    }
}
