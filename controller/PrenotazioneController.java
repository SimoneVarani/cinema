package cinema.simone.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cinema.simone.entity.Prenotazione;
import cinema.simone.repository.PrenotazioneRepository;
@RestController
@RequestMapping("/prenotazione")
public class PrenotazioneController {

			@Autowired
			private PrenotazioneRepository prenotazionerepository;

			@GetMapping(path = "")
			public Iterable<Prenotazione> getAllPrenotazioni() {
				return prenotazionerepository.findAll();
			}
			
			 @GetMapping(path = "/{id}")
		 	public String getID(@PathVariable("id") String id) {
		 	Optional<Prenotazione> prenotazione = prenotazionerepository.findById(id);
				if(prenotazione.isPresent()) {
					return prenotazione.get().toString();
				}
				return "Prenotazione non trovata";

	}

}
