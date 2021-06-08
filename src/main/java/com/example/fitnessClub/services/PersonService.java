package com.example.fitnessClub.services;

import com.example.fitnessClub.models.Person;

public interface PersonService {
    Person createPerson(Person person);
    void deletePersonById(Long id);
    Person getPersonById(Long id);
    Person updatePerson(Person person);
    boolean personExists(String login);
    boolean loginAndPasswordAreCorrect(Person person);
}
