package cinema.simone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cinema.simone.entity.Cinema;
import cinema.simone.entity.FilmInProgrammazione;
import cinema.simone.repository.FilmInProgrammazioneRepository;


@Service
public class FilmInProgrammazioneService {
	
	@Autowired
	private FilmInProgrammazioneRepository filmInProgrammazioneRepository;
    
	
	public Iterable<FilmInProgrammazione> getAllFilmInProgrammazione(){
		return filmInProgrammazioneRepository.findAll();
		
	}
	
	public Iterable<FilmInProgrammazione> getAllFilmInProgrammazioneByGenere(String genere){
		return filmInProgrammazioneRepository.findByGenere(genere);
	}
	
	public  Iterable<FilmInProgrammazione> getAllFilmInProgrammazioneByDistribution(String distribution){
		return filmInProgrammazioneRepository.findByDistribution(distribution);
	}
	
public  Iterable <FilmInProgrammazione> getFilms(String genere, String distribution) {
		
		
		if(genere != null)
			return getAllFilmInProgrammazioneByGenere(genere);
		if(distribution != null)
			return getAllFilmInProgrammazioneByDistribution(distribution);
	
		
		return getAllFilmInProgrammazione();
	}

}
