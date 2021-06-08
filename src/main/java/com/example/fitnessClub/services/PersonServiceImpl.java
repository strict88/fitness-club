package com.example.fitnessClub.services;

import com.example.fitnessClub.models.Person;
import com.example.fitnessClub.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonServiceImpl implements PersonService{
    private final PersonRepository repository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.repository = personRepository;
    }


    @Override
    public Person createPerson(Person person) {
        return repository.save(person);
    }

    @Override
    public void deletePersonById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Person getPersonById(Long id) {
        return repository.getOne(id);
    }

    @Override
    public Person updatePerson(Person person) {
        return repository.save(person);
    }

    @Override
    public boolean personExists(String login) {
        Person person = repository.getPersonByLogin(login);
        return person != null;
    }

    @Override
    public boolean loginAndPasswordAreCorrect(Person person) {
       return repository.getPersonByLoginAndPassword(person.getLogin(), person.getPassword()) != null;
    }
}
