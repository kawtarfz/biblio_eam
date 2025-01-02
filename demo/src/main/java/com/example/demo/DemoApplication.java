package com.example.demo;

import com.example.demo.dao.entities.Livre;
import com.example.demo.dao.entities.StatutLivre;
import com.example.demo.dao.entities.Utilisateur;
import com.example.demo.dao.repositories.LivreRepository;
import com.example.demo.dao.repositories.UtilisateurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UtilisateurRepository utilisateurRepository, LivreRepository livreRepository){
		return args -> {
			/*Stream.of("Douae", "Wissal", "Ayman", "Ilyass", "Khadija", "Nezha", "Fatiha", "BentTemara")
					.forEach(name -> {
						Utilisateur utilisateur = new Utilisateur();
						utilisateur.setNom(name);
						utilisateur.setEmail(name + "@gmail.com");
						utilisateurRepository.save(utilisateur);
					});

			Stream.of(
					new Object[]{"Les Misérables", "Victor Hugo", "1862-01-01", 12345, StatutLivre.DISPONIBLE},
					new Object[]{"Le Petit Prince", "Antoine de Saint-Exupéry", "1943-04-06", 67890, StatutLivre.DISPONIBLE},
					new Object[]{"L'Étranger", "Albert Camus", "1942-05-19", 11223, StatutLivre.DISPONIBLE},
					new Object[]{"1984", "George Orwell", "1949-06-08", 44556, StatutLivre.PERDU},
					new Object[]{"Madame Bovary", "Gustave Flaubert", "1857-12-01", 77889, StatutLivre.EMPRUNTE}
			).forEach(data -> {
				Livre livre = new Livre();
				livre.setTitre((String) data[0]);
				livre.setAuteur((String) data[1]);
				livre.setDatePublication(java.sql.Date.valueOf((String) data[2]));
				livre.setIsbn((Integer) data[3]);
				livre.setStatus((StatutLivre) data[4]);
				livreRepository.save(livre);
			});
*/

		};
	}

}
