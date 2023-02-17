package cinema.simone.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cinema.simone.entity.Cinema;
import cinema.simone.repository.CinemaRepository;

@RestController
@RequestMapping("/cinema")
public class CinemaController {

	@Autowired
	private CinemaRepository cinemaRepository;

	@GetMapping(path = "/all")
	public Iterable<Cinema> getAllUsers() {
		return cinemaRepository.findAll();
	}

	@GetMapping(path = "/find/{id}")
	public String getUser(@PathVariable ("id")Integer id) {

		Optional<Cinema> cinema = cinemaRepository.findById(id);
		if(cinema.isPresent()) {
			return cinema.get().toString();
		}
		return "Cinema non trovato";
	}

	@DeleteMapping(path = "/del/{id}")
	public String killUser(@PathVariable("id") Integer id) {

		Cinema c = new Cinema();
		if(cinemaRepository.existsById(id)) {
			c.setId(id);
			cinemaRepository.delete(c);
			return "Cinema " + c.getNome() + " cancellato"; 
		}
		else return "Cinema non esistente";
	}


	@PutMapping(path="/add/{nome}/{numeroSale}")
	public String addNewUser ( @PathVariable("nome") String nome,@PathVariable("numeroSale") Integer numeroSale) {

		Cinema c = new Cinema();
		c.setCitta("default");
		c.setNome(nome);
		c.setIndirizzo("default");
		c.setNumeroSale(numeroSale);
		cinemaRepository.save(c);
		return "Cinema " + c.getNome() +  " Salvato";
	}

}




