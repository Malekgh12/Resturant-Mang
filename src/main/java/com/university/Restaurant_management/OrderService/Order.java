package com.university.Restaurant_management.OrderService;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCommand")
    private long idCommand;

    @Column(name = "NameCommand")
    private  String NameCommand;

    @Column(name = "PrixCommand")
    private  double PrixCommand;

    @Column(name = "FraisLivraison")
    private double FraisLivraison;

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

    public double getPrixCommand() {
        return PrixCommand;
    }

    public void setPrixCommand(double prixCommand) {
        PrixCommand = prixCommand;
    }

    public double getFraisLivraison() {
        return FraisLivraison;
    }

    public void setFraisLivraison(double fraisLivraison) {
        FraisLivraison = fraisLivraison;
    }
}
