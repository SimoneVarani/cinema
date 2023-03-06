package cinema.simone.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cinema.simone.entity.FilmInProgrammazione;
import cinema.simone.repository.FilmInProgrammazioneRepository;
import cinema.simone.service.FilmInProgrammazioneService;

@RestController
@RequestMapping("/filmInProg")
public class FilmInProgrammazioneController {
	
	@Autowired
	private FilmInProgrammazioneService filmInProgrammazioneService;

	@GetMapping(path = "")
	public ResponseEntity<Iterable<FilmInProgrammazione>> getFilms( @RequestParam(required=false) String genere,
			                                                        @RequestParam(required=false) String distribution) {
			
		return ResponseEntity.ok(filmInProgrammazioneService.getFilms(genere,distribution));
	}
	

}
