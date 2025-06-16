package com.example.inqool.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "court_id")
    private Court court;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer owner;

    @Column
    private double cost;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp reservationStart;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp reservationEnd;

    @Enumerated
    private GameType gameType;
}
