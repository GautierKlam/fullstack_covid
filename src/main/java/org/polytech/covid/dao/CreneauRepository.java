package org.polytech.covid.dao;

import org.polytech.covid.entities.Creneau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreneauRepository extends JpaRepository<Creneau, Integer>{
    
}
