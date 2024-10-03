package com.university.Restaurant_management.ReservationService;

import com.university.Restaurant_management.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;


    public  List<Reservation> getAllReservation(){
        return reservationRepository.findAll();
    }

    public Reservation createReservation (Reservation reservation){
        return reservationRepository.save(reservation);
    }

    public Reservation UpadteReservation(Long id , Reservation reservationDetails){
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Reservation not found"));

        reservation.setName(reservationDetails.getName());
        reservation.setReservationTime(reservationDetails.getReservationTime());
        reservation.setNombrePerson(reservationDetails.getNombrePerson());
        reservation.setNombreTable(reservationDetails.getNombreTable());

        return reservationRepository.save(reservation);

    }

    public void deleteReservation(Long id){
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Reservation not found"));

        reservationRepository.delete(reservation);
    }

}
