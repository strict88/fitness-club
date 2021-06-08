package com.example.fitnessClub.services;

import com.example.fitnessClub.models.Aboniment;
import com.example.fitnessClub.repositories.AbonimentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AbonimentServiceImpl implements AbonimentService{

    private final AbonimentRepository repository;

    @Autowired
    public AbonimentServiceImpl(AbonimentRepository abonimentRepository) {
        this.repository = abonimentRepository;
    }

    @Override
    public Aboniment createAboniment(Aboniment aboniment) {
        return repository.save(aboniment);
    }

    @Override
    public void deleteAboniment(Aboniment aboniment) {
        repository.delete(aboniment);
    }

    @Override
    public Aboniment getAbonimentById(Long id) {
        return repository.getOne(id);
    }

    @Override
    public Aboniment updateAboniment(Aboniment aboniment) {
        return repository.save(aboniment);
    }
}
