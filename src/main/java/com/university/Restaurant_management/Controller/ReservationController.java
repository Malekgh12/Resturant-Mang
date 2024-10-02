package com.university.Restaurant_management.Controller;

import com.university.Restaurant_management.Entity.Reservation;
import com.university.Restaurant_management.Repository.ReservationRepository;
import com.university.Restaurant_management.Service.ReservationService;;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;


    @PostMapping("/AddReservation")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.createReservation(reservation);
    }

    @GetMapping
    public ResponseEntity<List<Reservation>> getAllReservation(){
        List<Reservation> reservations = reservationService.getAllReservation();
        return new ResponseEntity<>(reservations, HttpStatus.OK);
    }

    @PutMapping("/{id}")

    public Reservation updateReservation(@PathVariable Long id, @RequestBody Reservation reservationDetails){
        return reservationService.UpadteReservation(id, reservationDetails);
    }

    @DeleteMapping("/{id}")

     public ResponseEntity<?> deleteReservation(@PathVariable Long id ){
        reservationService.deleteReservation(id);
        return ResponseEntity.ok().build();
    }


}
