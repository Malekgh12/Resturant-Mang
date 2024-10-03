package com.university.Restaurant_management.MenuService;

import com.university.Restaurant_management.OrderService.Order;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "MenuDuJour")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    @Column(name = "Entrees")
    private String Entrees;

    @Column(name= "Suite")
    private String Suite;

    @Column(name = "Dessert")
    private String Dessert;

    @Column(name = "Prix")
    private double Prix;

    @ManyToMany(mappedBy = "menus")
    private List<Order> orders;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEntrees() {
        return Entrees;
    }

    public void setEntrees(String entrees) {
        Entrees = entrees;
    }

    public String getSuite() {
        return Suite;
    }

    public void setSuite(String suite) {
        Suite = suite;
    }

    public String getDessert() {
        return Dessert;
    }

    public void setDessert(String dessert) {
        Dessert = dessert;
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
