package com.example.fitnessClub.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class Aboniment {

    @Id
    @GeneratedValue
    private Long id;

    private Long price;

    private Date fromDate;

    private Date toDate;

    @OneToOne
    private AbonimentType abonimentType;
}
