package com.university.Restaurant_management.ReservationService;

import com.university.Restaurant_management.OrderService.Order;
import com.university.Restaurant_management.UserService.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

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

    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
    private User user;

    @OneToMany(mappedBy = "reservation")
    private Set<Order> orders;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}