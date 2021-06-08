package com.example.fitnessClub.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AbonimentType {

    @Id
    @GeneratedValue
    private Long id;

    private String typeName;
}
