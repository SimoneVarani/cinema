package cinema.simone.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cinema.simone.entity.Sale;
import cinema.simone.repository.SaleRepository;
@RestController
@RequestMapping("/sale")
public class SaleController {
	

			@Autowired
			private SaleRepository salerepository;;

			@GetMapping(path = "/all")
			public Iterable<Sale> getAllAuditorium() {
				return salerepository.findAll();
			}
			
			 @GetMapping(path = "/getId/{id}")
		 	public String getID(@PathVariable("id") Integer id) {
		 	Optional<Sale> sale = salerepository.findById(id);
				if(sale.isPresent()) {
					return sale.get().toString();
				}
				return "Sala non trovata";

	}

}
