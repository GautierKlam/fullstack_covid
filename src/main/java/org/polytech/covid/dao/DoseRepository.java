package org.polytech.covid.dao;

import org.polytech.covid.entities.Dose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoseRepository extends JpaRepository<Dose, Integer>{
    
}
