package com.example.inqool.model.entity;

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
    @Column(name="RESERVATION_ID")
    private  Long id;

    @ManyToOne
    @JoinColumn(name="COURT_ID")
    private Court court;

    @OneToOne
    @JoinColumn(name="USER_PHONE")
    private String phone;

    @Column
    private double cost;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp start;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp end;

    @Enumerated
    private GameType gameType;
}
