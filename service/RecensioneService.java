package cinema.simone.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cinema.simone.entity.Palinsesto;
import cinema.simone.entity.Recensione;
import cinema.simone.repository.RecensioneRepository;

	@Service
	public class RecensioneService {
		
		@Autowired
		private RecensioneRepository recensioneRepository;
		
		
		public Iterable<Recensione> getAllRecensione(){
			return recensioneRepository.findAll();
		}

		public Iterable<Recensione> getAllRecensioneById(String id){
			return recensioneRepository.findByCodice(id);
		}
	
		public Iterable<Recensione>getAllRecensioneByIdCodiceFilm(String idCodiceFilm){
			return recensioneRepository.findByIdCodiceFilm(idCodiceFilm);
		}
		
		public Iterable<Recensione>getAllRecensioneByNomeMagazine(String nomeMagazine){
			return recensioneRepository.findByNomeMagazine(nomeMagazine);
		}
		
	   
		public Iterable<Recensione> getRecensioni(String id,String codiceFilm,String nomeMagazine) {
			
			if(id != null)
				return getAllRecensioneById(id);
			if(codiceFilm != null)
				return getAllRecensioneByIdCodiceFilm(codiceFilm);
			if(nomeMagazine != null)
				return getAllRecensioneByNomeMagazine(nomeMagazine);
				
			
			
			return getAllRecensione();
		}
	
	
}
