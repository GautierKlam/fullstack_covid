package org.polytech.covid;

import org.polytech.covid.dao.AdresseRepository;
import org.polytech.covid.dao.CentreRepository;
import org.polytech.covid.dao.MedecinRepository;
import org.polytech.covid.dao.PatientRepository;
import org.polytech.covid.dao.ReservationRepository;
import org.polytech.covid.entities.Adresse;
import org.polytech.covid.entities.Centre;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CovidApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidApiApplication.class, args);
	}

	@Bean
    CommandLineRunner runner   (CentreRepository centreInterface, AdresseRepository adresseInterface, MedecinRepository medecinInterface, PatientRepository patientInterface, ReservationRepository reservationInterface){
        return args -> {
            centreInterface.save(new Centre("CHRU Nancy Brabois",new Adresse("Vandoeuvre-les-Nancy","54511","FRANCE","Rue de Morvan"), null));
           

           
        };
}
}
