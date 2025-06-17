package com.example.inqool.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "court_id")
    private Court reservationCourt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "owner_id")
    private Customer owner;

    @Column
    private double cost;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp creation;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp reservationStart;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp reservationEnd;

    @Enumerated
    private GameType gameType;
}
