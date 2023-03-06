package cinema.simone.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cinema.simone.entity.Cinema;
import cinema.simone.entity.FilmInProgrammazione;
import cinema.simone.entity.Palinsesto;
import cinema.simone.repository.PalinsestoRepository;
import cinema.simone.service.PalinsestoService;

/*
 *  /schedules
 *  /schedules/10/sales/123
 * 
 */
@RestController
@RequestMapping("/palinsesto")
public class PalinsestoController {

	@Autowired
	private PalinsestoService palinsestoService;
	
	/*

	@GetMapping(path = "/")
	public Iterable<Palinsesto> getAllSchedule() {
		return palinsestoService.getAllPalinsesto();
	}
	
	 @GetMapping(path = "/{codice}")
 	public String getId(@RequestParam(required=false) String  codice) {
 	Optional<Palinsesto> Palinsensto = palinsestoService.findById(codice);
		if(Palinsensto.isPresent()) {
			return Palinsensto.get().toString();
		}
		return "Palinsesto non trovato";

}
*/
	@GetMapping(path = "")
	public ResponseEntity<Iterable<Palinsesto>> getPalinsesti( @RequestParam(required=false) String codice  ) {
			                                                
			return ResponseEntity.ok(palinsestoService.getPalinsesti(codice));
	}
}




