package com.university.Restaurant_management.Service;




import com.university.Restaurant_management.Entity.User;
import com.university.Restaurant_management.Repository.UserRepository;
import com.university.Restaurant_management.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public  List<User> getAllUser(){
        return userRepository.findAll();
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User UpadteUser(Long idUser , User UserDetails){
        User user = userRepository.findById(idUser)
                .orElseThrow(()-> new ResourceNotFoundException("User not found"));

        user.setNameUser(UserDetails.getNameUser());
        user.setPrenomUser(UserDetails.getPrenomUser());
        user.setEmail(UserDetails.getEmail());
        user.setPassword(UserDetails.getPassword());
        user.setNumeroTélephone(UserDetails.getNumeroTélephone());
        return userRepository.save(user);

    }

    public void deleteUser(Long idUser){
        User user = userRepository.findById(idUser)
                .orElseThrow(()-> new ResourceNotFoundException("User not found"));

        userRepository.delete(user);
    }


}
