package com.example.inqool.model.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Court {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="COURT_ID")
    private  Long id;

    @Column(name="COST_PER_MINUTE")
    private double cost;
}
