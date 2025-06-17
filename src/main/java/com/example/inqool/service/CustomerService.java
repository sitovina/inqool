package com.example.inqool.service;

import com.example.inqool.model.Customer;
import com.example.inqool.model.Reservation;
import com.example.inqool.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Optional<Set<Reservation>> getCustomerReservationsByPhone(String phone, Date date) {
        return Optional.ofNullable(customerRepository.findByPhoneAndCustomerReservationsReservationStartAfter(phone, date));
    }

    public Optional<Customer> getCustomerByPhone(String phone) {
        return Optional.ofNullable(customerRepository.findByPhone(phone));
    }

    public Customer createCustomer(Customer court) {
        return customerRepository.save(court);
    }

    public void deleteCourt(Long id) {
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
        } else {
            throw new RuntimeException("Court with id: " + id + " not found");
        }
    }

}
