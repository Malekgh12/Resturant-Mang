package com.university.Restaurant_management.Entity;

import jakarta.persistence.*;
import jdk.jfr.Description;

@Entity
@Table(name = "Dishes")
public class Dishes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long Id;

    @Column(name = "Name")
    private String Name;

    @Column(name ="Discription")
    private String Discription ;

    @Column(name = "Prix")
    private double Prix;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String discription) {
        Discription = discription;
    }

    public double getPrix() {
        return Prix;
    }

    public void setPrix(double prix) {
        Prix = prix;
    }
}
