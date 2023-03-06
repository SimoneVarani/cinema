package cinema.simone.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import cinema.simone.entity.Utente;

public interface UserRepository  extends CrudRepository<Utente, String>{

	@Query(value="SELECT u FROM Utente u WHERE u.userName=?1")
	Iterable<Utente> findByUserName(String userName);
	
	@Query(value="SELECT u FROM Utente u WHERE u.email=?1")
	Iterable<Utente> findByEmail(String email);
	
	@Query(value="SELECT u FROM Utente u WHERE u.userName=?1 and u.password=?2")
	Iterable<Utente> findByUserAndEmail(String userName,String password);
	
	
	
}
