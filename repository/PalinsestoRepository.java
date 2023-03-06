package cinema.simone.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import cinema.simone.entity.Palinsesto;

public interface PalinsestoRepository extends CrudRepository<Palinsesto,String>{
	
	@Query(value="SELECT p FROM Palinsesto p WHERE p.codice=?1")
	Iterable<Palinsesto> findByCodice(String codice);

}
