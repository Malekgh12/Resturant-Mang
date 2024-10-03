package com.university.Restaurant_management.OrderService;

import com.university.Restaurant_management.DishesService.Dishes;
import com.university.Restaurant_management.MenuService.Menu;
import com.university.Restaurant_management.ReservationService.Reservation;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

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


    @ManyToMany
    @JoinTable(
            name = "order_menu",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "menu_id")
    )
    private List<Menu> menus;

    @ManyToMany
    @JoinTable(
            name = "order_dish",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "dish_id")
    )

    private List<Dishes> dishes;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

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

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public List<Dishes> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dishes> dishes) {
        this.dishes = dishes;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
