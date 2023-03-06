package cinema.simone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cinema.simone.entity.Utente;
import cinema.simone.repository.UserRepository;
	
	@Service
	public class UtenteService {
		
		@Autowired
		private UserRepository userRepository;
		
		public Iterable<Utente> getAllUser(){
			return userRepository.findAll();
		}

		public Iterable<Utente> getAllUserByUserName(String userName){
			return userRepository.findByUserName(userName);
		}
		
		public Iterable<Utente> getAlluserByEmail(String email){
			return userRepository.findByEmail(email);
		}
		
		public Iterable<Utente> getAllUserByUserNameAndEmail(String userName,String email){
			return userRepository.findByUserAndEmail(userName,email);
		}
		
		
	   
		public Iterable<Utente> getUser(String userName, String email,String Password) {
			
			if(userName != null && email != null)
				return getAllUserByUserNameAndEmail(userName,email);	
			if(userName != null)
				return getAllUserByUserName(userName);
			if(email != null)
				return getAlluserByEmail(email);
			
			return getAllUser();
		}
	

}
