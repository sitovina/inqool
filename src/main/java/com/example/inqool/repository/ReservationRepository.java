package com.example.inqool.repository;

import com.example.inqool.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.Set;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Set<Reservation> findAllByReservationStartAfterAndReservationEndBefore(Date reservationStart, Date reservationEnd);
}