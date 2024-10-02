package com.university.Restaurant_management.Repository;

import com.university.Restaurant_management.Entity.Dishes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishesRepository extends JpaRepository<Dishes, Long> {
}
