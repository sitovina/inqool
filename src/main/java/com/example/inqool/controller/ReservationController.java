package com.example.inqool.controller;

import com.example.inqool.model.Court;
import com.example.inqool.model.Reservation;
import com.example.inqool.service.CourtService;
import com.example.inqool.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    @Autowired
    private CourtService courtService;

    @GetMapping("/{id}")
    public Set<Reservation> getReservationsByCourtId(@PathVariable Long id) {
        Optional<Court> court = courtService.getCourtById(id);
        if (court.isPresent()) {
            Court courtProper = court.get();
            return courtProper.getCourtReservations();
        }
        else return Collections.emptySet();
    }


}
