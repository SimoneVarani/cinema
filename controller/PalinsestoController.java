package cinema.simone.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cinema.simone.entity.Palinsesto;
import cinema.simone.repository.PalinsestoRepository;

/*
 *  /schedules
 *  /schedules/10/sales/123
 * 
 */
@RestController
@RequestMapping("/palinsesto")
public class PalinsestoController {

	@Autowired
	private PalinsestoRepository palinsestoRepository;

	@GetMapping(path = "/all")
	public Iterable<Palinsesto> getAllSchedule() {
		return palinsestoRepository.findAll();
	}
	
	 @GetMapping(path = "/getId/{codice}")
 	public String getID(@PathVariable("codice") String codice) {
 	Optional<Palinsesto> Palinsensto = palinsestoRepository.findById(codice);
		if(Palinsensto.isPresent()) {
			return Palinsensto.get().toString();
		}
		return "Palinsesto non trovato";

}
}




