package com.example.inqool.repository;

import com.example.inqool.model.Customer;
import com.example.inqool.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.Set;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByPhone(String phone);
    Set<Reservation> findByPhoneAndCustomerReservationsReservationStartAfter(String phone, Date date);
}