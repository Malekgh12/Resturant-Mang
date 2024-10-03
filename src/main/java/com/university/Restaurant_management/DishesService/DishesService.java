package com.university.Restaurant_management.DishesService;


import com.university.Restaurant_management.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishesService {

    @Autowired
    private DishesRepository dishesRepository;

    public List<Dishes> getAllDishes(){
        return dishesRepository.findAll();
    }

    public Dishes createDishes(Dishes dishes){
        return dishesRepository.save(dishes);
    }

    public Dishes UpadteDishes(Long id , Dishes dishesDetails){
        Dishes dishes = dishesRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Dishes not found"));

        dishes.setName(dishesDetails.getName());
        dishes.setDiscription(dishesDetails.getName());
        dishes.setPrix(dishesDetails.getPrix());
        return dishesRepository.save(dishes);

    }

    public void deleteDishes(Long id){
        Dishes dishes = dishesRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Dishes not found"));

        dishesRepository.delete(dishes);
    }
}
