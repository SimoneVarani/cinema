package cinema.simone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cinema.simone.entity.Palinsesto;
import cinema.simone.entity.Recensione;
import cinema.simone.repository.PalinsestoRepository;
import cinema.simone.repository.RecensioneRepository;

@RestController
@RequestMapping("/recensione")
public class RecensioneController {
	
	@Autowired
	private RecensioneRepository recensioneRepository;

	@GetMapping(path = "/all")
	public Iterable<Recensione> getAllSchedule() {
		return recensioneRepository.findAll();
	}


}
