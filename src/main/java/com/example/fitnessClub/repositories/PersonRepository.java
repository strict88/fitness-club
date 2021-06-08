package com.example.fitnessClub.repositories;

import com.example.fitnessClub.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person getPersonByLogin(String login);
    Person getPersonByLoginAndPassword(String login, String password);
}
