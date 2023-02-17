package cinema.simone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "utente")

public class Utente {
	
	@Id 
	@Column(name = "UserName")
	private String userName;
	@Column( name = "Email")
	private String email;
	@Column(name = "Password")
	private String password;
	@Column(name = "Nome")
	private String nome;
	@Column (name = "Cognome")
	private String cognome;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	@Override
	public String toString() {
		return "Utente [userName=" + userName + ", email=" + email + ", password=" + password + ", nome=" + nome
				+ ", cognome=" + cognome + "]";
	}
	
	
	
}
