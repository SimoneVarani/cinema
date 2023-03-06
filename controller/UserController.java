package cinema.simone.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cinema.simone.entity.Utente;
import cinema.simone.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping(path = "/")
	public Iterable<Utente> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping(path = "/{userName}")
	public String getUser(@PathVariable String userName) {

		Optional<Utente> utente = userRepository.findById(userName);
		if(utente.isPresent()) {
			return utente.get().toString();
		}
		return "Utente non trovato";
	}

	@DeleteMapping(path = "/del/{userName}")//come capire se devo cancellare piuttosto che inserire???
	public String killUser(@PathVariable("userName") String userName) {

		Utente u = new Utente();
		if(userRepository.existsById(userName)) {
			u.setUserName(userName);
			userRepository.delete(u);
			return "Utente " + userName + " cancellato"; 
		}
		else return "Utente non esistente";
	}
	
	
	@PutMapping(path="/add/{userName}/{password}/{mail}")
	public String addNewUser (@PathVariable("userName") String userName, @PathVariable("password")String password,@PathVariable("mail") String mail) {

		Utente u = new Utente();
		u.setNome("default");
		u.setEmail(mail);
		u.setCognome("default");
		u.setPassword(password);
		u.setUserName(userName);

		if (userRepository.existsById(userName)){
			return "Utente gia esistente";
		}
		userRepository.save(u);
		return "Utente Salvato";
	}

}




