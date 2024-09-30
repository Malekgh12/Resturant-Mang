package com.university.Restaurant_management.Service;

import com.university.Restaurant_management.Entity.Reservation;
import com.university.Restaurant_management.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    @Autowired
    public  ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getAllResevation(){
        return reservationRepository.findAll();
    }

    public Reservation createReservation(Reservation reservation){
        return reservationRepository.save(reservation);
    }
}
