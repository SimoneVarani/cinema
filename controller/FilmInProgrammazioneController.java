package cinema.simone.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cinema.simone.entity.FilmInProgrammazione;
import cinema.simone.repository.FilmInProgrammazioneRepository;

@RestController
@RequestMapping("/filmInProg")
public class FilmInProgrammazioneController {
	
	@Autowired
	private FilmInProgrammazioneRepository filmInProgrammazioneRepository;

	@GetMapping(path = "/all")
	public Iterable<FilmInProgrammazione> getAllFilm() {
		return filmInProgrammazioneRepository.findAll();
	}
	
    @GetMapping(path = "/getId/{codice}")
    	public String getID(@PathVariable("codice") String codice) {
    	Optional<FilmInProgrammazione> FilmInProgrammazione = filmInProgrammazioneRepository.findById(codice);
		if(FilmInProgrammazione.isPresent()) {
			return FilmInProgrammazione.get().toString();
		}
		return "Film In Programmazione non trovato";
    }
}
