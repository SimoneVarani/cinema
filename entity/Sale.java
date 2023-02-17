package cinema.simone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sale")

public class Sale {
	
	@Id @Column(name = "id")
	private int id;
	@Column (name = "Occupazione")
	private int occupazione;
	@Column(name = "NumeroPosti")
	private int numeroPosti;
	@Column (name = "NumeroSala")
	private String numeroSala;
	@Column(name = "Cinema")
	private int cinema;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOccupazione() {
		return occupazione;
	}
	public void setOccupazione(int occupazione) {
		this.occupazione = occupazione;
	}
	public int getNumeroPosti() {
		return numeroPosti;
	}
	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
	public String getNumeroSala() {
		return numeroSala;
	}
	public void setNumeroSala(String numeroSala) {
		this.numeroSala = numeroSala;
	}
	public int getCinema() {
		return cinema;
	}
	public void setCinema(int cinema) {
		this.cinema = cinema;
	}
	
	

}
