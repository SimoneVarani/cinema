package cinema.simone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cinema.simone.entity.Cinema;
import cinema.simone.repository.CinemaRepository;


@Service
public class CinemaService {
	
	@Autowired
	private CinemaRepository cinemaRepository;
	
	
	public Iterable<Cinema> getAllCinema(){
		return cinemaRepository.findAll();
	}

	public Iterable<Cinema> getAllCinemaByCity(String citta){
		return cinemaRepository.findByCity(citta);
	}
	
	public Iterable<Cinema> getAllCinemaByNumeroSale(Integer numeroSale){
		return cinemaRepository.findBySaleNumber(numeroSale);
	}
	
	public Iterable<Cinema> getAllCinemaByNumeroSaleAndCity(Integer numeroSale,String citta){
		return cinemaRepository.findBySaleNumberAndCity(numeroSale,citta);
	}
	
	
   
	public Iterable<Cinema> getCinemas(String citta, Integer numeroSale) {
		
		if(citta != null && numeroSale != null)
			return getAllCinemaByNumeroSaleAndCity(numeroSale,citta);	
		if(citta != null)
			return getAllCinemaByCity(citta);
		if(numeroSale != null)
			return getAllCinemaByNumeroSale(numeroSale);
		
		return getAllCinema();
	}


}
