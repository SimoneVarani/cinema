package cinema.simone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cinema.simone.entity.Cinema;
import cinema.simone.entity.Palinsesto;
import cinema.simone.repository.CinemaRepository;
import cinema.simone.repository.PalinsestoRepository;


	@Service
	public class PalinsestoService {
		
		@Autowired
		private PalinsestoRepository palinsestoRepository;;
		
		
		public Iterable<Palinsesto> getAllPalinsesto(){
			return palinsestoRepository.findAll();
		}

		public Iterable<Palinsesto> getAllPalinsestoByCodice(String codice){
			return palinsestoRepository.findByCodice(codice);
		}
	
		
		
	   
		public Iterable<Palinsesto> getPalinsesti(String codice) {
			
			if(codice != null)
				return getAllPalinsestoByCodice(codice);	
			
			return getAllPalinsesto();
		}

	

}
