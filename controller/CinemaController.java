package cinema.simone.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;

import cinema.simone.entity.Cinema;
import cinema.simone.service.CinemaService;

@RestController
@RequestMapping("/cinema")
public class CinemaController {

	@Autowired
	private CinemaService cinemaService;
	
	
	/*
	 * @RequestParam ==> QueryParmaters => Serve a filtrare
	 * @PathVariable ("id")Integer id ==> Identifica una risorsa
	 */
	/*
	@GetMapping(path = "")
	public ResponseEntity<Iterable<Cinema>> getUsers(@RequestParam(required=false) String citta) {
		if(citta != null) {
			
			return ResponseEntity.ok(cinemaRepository.findByCity(citta));
		}
	
		return ResponseEntity.ok(cinemaRepository.findAll());
	}

	*/
	@GetMapping(path = "")
	public ResponseEntity<Iterable<Cinema>> getUsers(@RequestParam(required=false) String citta,@RequestParam(required=false) Integer numeroSale) {
			
		return ResponseEntity.ok(cinemaService.getCinemas(citta,numeroSale));
	}
	
	/*
	
	
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
	
	*/

}




