package com.example.fitnessClub.repositories;

import com.example.fitnessClub.models.Aboniment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonimentRepository extends JpaRepository<Aboniment, Long> {
}
