package cinema.simone.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cinema.simone.entity.Posto;
import cinema.simone.repository.PostoRepository;
@RestController
@RequestMapping("/posto")
public class PostoController {

		@Autowired
		private PostoRepository postoRepository;

		@GetMapping(path = "/all")
		public Iterable<Posto> getAllSchedule() {
			return postoRepository.findAll();
		}
		
		 @GetMapping(path = "/getId/{id}")
	 	public String getID(@PathVariable("id") String id) {
	 	Optional<Posto> Posto = postoRepository.findById(id);
			if(Posto.isPresent()) {
				return Posto.get().toString();
			}
			return "Posto non trovato";

}
}
	 	
		 
