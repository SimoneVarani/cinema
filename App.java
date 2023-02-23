package cinema.simone;
  

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@org.springframework.boot.autoconfigure.domain.EntityScan
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

/*
Pulire il codice 
creare service di tutte le entity
creare nuove query custom
creare le collection in postman
*/