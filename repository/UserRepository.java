package cinema.simone.repository;

import org.springframework.data.repository.CrudRepository;

import cinema.simone.entity.Utente;

public interface UserRepository  extends CrudRepository<Utente, String>{


}
