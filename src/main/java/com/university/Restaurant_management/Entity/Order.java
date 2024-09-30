package com.university.Restaurant_management.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCommand")
    private long idCommand;

    @Column(name = "NameCommand")
    private  String NameCommand;

    @Column(name = "PrixCommand")
    private int PrixCommand;

    @Column(name = "FraisLivraison")
    private int FraisLivraison;


    public long getIdCommand() {
        return idCommand;
    }

    public void setIdCommand(long idCommand) {
        this.idCommand = idCommand;
    }

    public String getNameCommand() {
        return NameCommand;
    }

    public void setNameCommand(String nameCommand) {
        NameCommand = nameCommand;
    }

    public int getPrixCommand() {
        return PrixCommand;
    }

    public void setPrixCommand(int prixCommand) {
        PrixCommand = prixCommand;
    }

    public int getFraisLivraison() {
        return FraisLivraison;
    }

    public void setFraisLivraison(int fraisLivraison) {
        FraisLivraison = fraisLivraison;
    }
}
