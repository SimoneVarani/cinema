package cinema.simone.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import cinema.simone.entity.Cinema;
import cinema.simone.entity.FilmInProgrammazione;

public interface FilmInProgrammazioneRepository extends CrudRepository<FilmInProgrammazione, String> {
	
	@Query(value="SELECT f FROM FilmInProgrammazione f WHERE f.distribuzione=?1")
	Iterable<FilmInProgrammazione> findByDistribution(String distribuzione);
	
	@Query(value="SELECT f FROM FilmInProgrammazione f WHERE f.genere=?1")
	Iterable<FilmInProgrammazione> findByGenere(String genere);
	


}
