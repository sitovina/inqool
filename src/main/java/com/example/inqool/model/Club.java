package com.example.inqool.model.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CLUB_ID")
    private Long id;

    @Column(name="CLUB_NAME")
    private String name;

    @OneToMany
    private List<Court> courtList;
}
