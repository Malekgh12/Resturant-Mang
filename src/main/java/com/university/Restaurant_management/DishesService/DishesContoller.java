package com.university.Restaurant_management.DishesService;


;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Dishes")
public class DishesContoller {
    @Autowired
    private DishesService dishesService;

    @PostMapping("/AddDishes")
    public Dishes createDishes(@RequestBody Dishes dishes) {
        return dishesService.createDishes(dishes);
    }


    @GetMapping
    public ResponseEntity<List<Dishes>> getAllDishes(){
        List<Dishes> Dishes = dishesService.getAllDishes();
        return new ResponseEntity<>(Dishes, HttpStatus.OK);
    }

    @PutMapping("/{id}")

    public Dishes UpdateDishes(@PathVariable Long id, @RequestBody Dishes dishesDetails) {
        return dishesService.UpadteDishes(id, dishesDetails);
    }

    @DeleteMapping("/{id}")

    public ResponseEntity<?> deleteDishes(@PathVariable Long id){
        dishesService.deleteDishes(id);
        return ResponseEntity.ok().build();
    }
}
