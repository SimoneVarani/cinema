package cinema.simone.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import cinema.simone.entity.Recensione;

public interface RecensioneRepository extends CrudRepository<Recensione,String> {
	
	
	@Query(value="SELECT r FROM Recensione r WHERE r.idRecensione=?1")
	Iterable<Recensione> findByCodice(String id);

	@Query(value="SELECT r FROM Recensione r WHERE r.idCodiceFilm=?1")
	Iterable<Recensione> findByIdCodiceFilm(String idCodice);

	@Query(value="SELECT r FROM Recensione r WHERE r.nomeMagazine=?1")
	Iterable<Recensione> findByNomeMagazine(String nomeMagazine);

}
