package org.polytech.covid.dao;

import org.polytech.covid.entities.Vaccin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccinRepository extends JpaRepository<Vaccin, Integer>{
    
}
