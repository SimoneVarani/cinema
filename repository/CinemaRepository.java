package cinema.simone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import cinema.simone.entity.Cinema;

public interface CinemaRepository extends CrudRepository<Cinema , Integer> {
	
	@Query(value="SELECT c FROM Cinema c WHERE c.citta=?1")
	Iterable<Cinema> findByCity(String citta);
	
	@Query(value="SELECT c FROM Cinema c WHERE c.numeroSale=?1")
	Iterable<Cinema> findBySaleNumber(Integer numeroSale);
	
	@Query(value="SELECT c FROM Cinema c WHERE c.numeroSale=?1 and c.citta=?2")
	Iterable<Cinema> findBySaleNumberAndCity(Integer numeroSale,String citta);
}
