package com.university.Restaurant_management.Controller;

import com.university.Restaurant_management.Entity.Reservation;
import com.university.Restaurant_management.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService){
        this.reservationService = reservationService;
    }

    @GetMapping
    public ResponseEntity<List<Reservation>> getAllReservation(){
        List<Reservation> reservations = reservationService.getAllResevation();
        return new ResponseEntity<>(reservations, HttpStatus.OK);
    }

}
