package com.example.inqool.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class User {

    @Id
    @Column(name="USER_PHONE")
    private String phone;

    @Column(name="USER_FIRSTNAME")
    private String firstName;

    @Column(name="USER_LASTNAME")
    private String lastName;

}
