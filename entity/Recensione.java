package cinema.simone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recensione")

public class Recensione {
	
	@Id @Column (name = "idRecensione")
	private String idRecensione;
	@Column(name = "Testo")
	private String testo;
	@Column(name = "NomeMagazine")
	private String nomeMagazine;
	@Column(name = "idCodiceFilm")
	private String idCodiceFilm;
	public String getIdRecensione() {
		return idRecensione;
	}
	public void setIdRecensione(String idRecensione) {
		this.idRecensione = idRecensione;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public String getNomeMagazine() {
		return nomeMagazine;
	}
	public void setNomeMagazine(String nomeMagazine) {
		this.nomeMagazine = nomeMagazine;
	}
	public String getIdCodiceFilm() {
		return idCodiceFilm;
	}
	public void setIdCodiceFilm(String idCodiceFilm) {
		this.idCodiceFilm = idCodiceFilm;
	}
	
	
}
