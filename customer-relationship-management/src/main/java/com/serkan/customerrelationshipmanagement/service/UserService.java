package com.serkan.customerrelationshipmanagement.service;

import com.serkan.customerrelationshipmanagement.model.User;
import com.serkan.customerrelationshipmanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
