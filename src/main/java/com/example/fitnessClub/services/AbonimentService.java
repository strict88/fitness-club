package com.example.fitnessClub.services;

import com.example.fitnessClub.models.Aboniment;

public interface AbonimentService {
    Aboniment createAboniment(Aboniment aboniment);
    void deleteAboniment(Aboniment aboniment);
    Aboniment getAbonimentById(Long id);
    Aboniment updateAboniment(Aboniment aboniment);
}
