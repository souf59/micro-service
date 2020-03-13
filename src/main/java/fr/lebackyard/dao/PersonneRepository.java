package fr.lebackyard.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.lebackyard.entities.Personne;

@CrossOrigin("*")
@RepositoryRestResource
public interface PersonneRepository extends JpaRepository<Personne, Long> {
	@Query("select p from Personne p where p.nom like :x")
	public List<Personne> chercher(@Param("x") String nom);

}
