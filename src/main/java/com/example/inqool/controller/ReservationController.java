package com.example.inqool.controller;

import com.example.inqool.model.Court;
import com.example.inqool.model.Customer;
import com.example.inqool.model.Reservation;
import com.example.inqool.service.CourtService;
import com.example.inqool.service.CustomerService;
import com.example.inqool.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    @Autowired
    private CourtService courtService;
    @Autowired
    private CustomerService customerService;

    @GetMapping("/court/{id}")
    public Set<Reservation> getReservationsByCourtId(@PathVariable Long id) {
        Optional<Court> optCourt = courtService.getCourtById(id);
        if (optCourt.isEmpty()) return Collections.emptySet();
        Court court = optCourt.get();
        return court.getCourtReservations();
    }

    @GetMapping("/phone/{phone}")
    public Set<Reservation> getReservationByPhone(@PathVariable String phone) {
        Optional<Customer> optCustomer = customerService.getCustomerByPhone(phone);
        if (optCustomer.isEmpty()) return Collections.emptySet();
        Customer customer = optCustomer.get();
        return customer.getCustomerReservations();
    }

    @GetMapping("/create/")
}
