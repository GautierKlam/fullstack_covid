package org.polytech.covid;

import org.polytech.covid.dao.AdministrateurRepository;
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
    CommandLineRunner runner   (CentreRepository centreInterface, AdresseRepository adresseInterface, MedecinRepository medecinInterface, PatientRepository patientInterface, ReservationRepository reservationInterface, AdministrateurRepository administrateurInterface){
        return args -> {
            centreInterface.save(new Centre("CHRU Nancy Brabois",new Adresse("Vandoeuvre-les-Nancy","54511","FRANCE","Rue de Morvan"), null));
            centreInterface.save(new Centre("CHR Metz",new Adresse("Thionville","57530","FRANCE","Allee du chateau"), null));
            centreInterface.save(new Centre("CHRU Strasbourg",new Adresse("Strasbourg","67000","FRANCE","place de l'hopitale"), null));


           
        };
}
}
