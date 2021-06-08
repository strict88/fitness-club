package com.example.fitnessClub.models;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String surname;

    private String phoneNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date birthDay;

    @OneToOne
    private Aboniment aboniment;

    private String login;

    private String password;

    @OneToOne(fetch = FetchType.EAGER)
    private Role role = new Role("USER");
}
