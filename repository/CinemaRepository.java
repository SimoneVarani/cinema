package cinema.simone.repository;

import org.springframework.data.repository.CrudRepository;

import cinema.simone.entity.Cinema;

public interface CinemaRepository extends CrudRepository<Cinema , Integer> {
	

}
