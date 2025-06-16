package com.example.inqool.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String phone;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @OneToMany(mappedBy = "owner")
    @JsonManagedReference
    @ElementCollection
    private Set<Reservation> customerReservations;

}
