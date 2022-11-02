package org.polytech.covid.dao;

import org.polytech.covid.entities.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur, Integer> {
    Administrateur searchByEmail(String email);
}
