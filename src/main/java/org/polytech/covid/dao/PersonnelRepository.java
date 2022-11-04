package org.polytech.covid.dao;

import org.polytech.covid.entities.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnelRepository extends JpaRepository<Personnel, Integer> {
    Personnel searchByEmail(String email);
}
