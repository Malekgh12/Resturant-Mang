package com.university.Restaurant_management.ReservationService;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Prénom")
    private String prénom;

    @Column(name = "reservationTime")
    private LocalDateTime reservationTime;

    @Column(name = "NombrePerson")
    private int nombrePerson;

    @Column(name = "NombreTable")
    private int nombreTable;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(LocalDateTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    public int getNombrePerson() {
        return nombrePerson;
    }

    public void setNombrePerson(int nombrePerson) {
        this.nombrePerson = nombrePerson;
    }

    public int getNombreTable() {
        return nombreTable;
    }

    public void setNombreTable(int nombreTable) {
        this.nombreTable = nombreTable;
    }
}