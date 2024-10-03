package com.university.Restaurant_management.DishesService;

import com.university.Restaurant_management.OrderService.Order;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Dishes")
public class Dishes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDishes")
    private Long idDishes;

    @Column(name = "Name")
    private String Name;

    @Column(name ="Description")
    private String Description ;

    @Column(name = "Prix")
    private double Prix;

    @ManyToMany(mappedBy = "dishes")
    private List<Order> orders;

    public Long getIdDishes() {
        return idDishes;
    }

    public void setIdDishes(Long idDishes) {
        this.idDishes = idDishes;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrix() {
        return Prix;
    }

    public void setPrix(double prix) {
        Prix = prix;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
