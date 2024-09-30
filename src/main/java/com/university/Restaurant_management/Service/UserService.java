package com.university.Restaurant_management.Service;


import com.university.Restaurant_management.Entity.User;
import com.university.Restaurant_management.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public  UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public User createUser(User user){
        return userRepository.save(user);
    }
}
