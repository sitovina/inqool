package com.example.inqool.service;

import com.example.inqool.model.Reservation;
import com.example.inqool.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository courtRepository) {
        this.reservationRepository = courtRepository;
    }

    public List<Reservation> getAllCourts() {
        return reservationRepository.findAll();
    }

    public Optional<Reservation> getCourtById(Long id) {
        return reservationRepository.findById(id);
    }

    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Set<Reservation> findOverlappingReservations(Date reservationStart , Date reservationEnd){
        return reservationRepository.findAllByReservationStartAfterAndReservationEndBefore(reservationStart, reservationEnd);
    }

    public void deleteCourt(Long id) {
        if (reservationRepository.existsById(id)) {
            reservationRepository.deleteById(id);
        } else {
            throw new RuntimeException("Court with id: " + id + " not found");
        }
    }

}
