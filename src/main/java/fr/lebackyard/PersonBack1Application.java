package fr.lebackyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import fr.lebackyard.dao.PersonneRepository;
import fr.lebackyard.entities.Personne;

@SpringBootApplication
public class PersonBack1Application implements CommandLineRunner {
@Autowired
private PersonneRepository personneRepository;
	public static void main(String[] args) {
		SpringApplication.run(PersonBack1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personneRepository.save(new Personne(null, "souf","souf"));
		personneRepository.save(new Personne(null, "sami","sami"));
		personneRepository.save(new Personne(null, "pierre","pierre"));
		
		personneRepository.findAll().forEach(p->{
			System.out.println(p.getNom());
		});
		
	}

}
