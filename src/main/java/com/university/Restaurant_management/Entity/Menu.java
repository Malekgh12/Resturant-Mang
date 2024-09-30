package com.university.Restaurant_management.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    @Column(name = "Name")
    private String Name;

    @Column(name= "Description")
    private String Description;

    @Column(name = "Prix")
    private int Prix;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public int getPrix() {
        return Prix;
    }

    public void setPrix(int prix) {
        this.Prix = prix;
    }
}
