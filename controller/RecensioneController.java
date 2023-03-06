package cinema.simone.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cinema.simone.entity.Cinema;
import cinema.simone.entity.Recensione;
import cinema.simone.repository.RecensioneRepository;
import cinema.simone.service.RecensioneService;

@RestController
@RequestMapping("/recensione")
public class RecensioneController {
	
	//@Autowired
	//private RecensioneRepository recensioneRepository;
	@Autowired
	private RecensioneService recensioneService;

	@GetMapping(path = "")
	public ResponseEntity<Iterable<Recensione>> getRecension(@RequestParam(required=false) String id,
			                                                 @RequestParam(required=false) String codiceFilm,
			                                                 @RequestParam(required=false) String nomeMagazine) {
		
		return ResponseEntity.ok(recensioneService.getRecensioni(id,codiceFilm,nomeMagazine));
	}
	/*
    @PutMapping(path = "/add/{recensione}")
    public String insertRecens(@PathVariable("recensione") String recensione) {
    	Recensione r = new Recensione();
    
    	r.setNomeMagazine("Default");
    	r.setTesto(recensione);
        return "Recensione Inserita";
    	}
    
    @GetMapping(path = "/getId/{id}")
    public String getId(@PathVariable("id") String id) {
		Optional<Recensione> recensione = recensioneRepository.findById(id);
		if(recensione.isPresent()) {
			return recensione.get().toString();
		}
		return "Recensione non trovata";
    	
    }
    */
}
