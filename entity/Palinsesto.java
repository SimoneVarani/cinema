package cinema.simone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "palinsesto")

public class Palinsesto {
	
	@Id @Column(name = "Codice") 
    private  String codice;
	@Column(name = "idCodiceFilm") 
    private  String idCodiceFilm;
	@Column(name = "idSala") 
    private  int idSala;
	@Column(name = "idCinema") 
    private  int idCinema;
	@Column(name = "DataPalinsesto") 
    private  String dataPalinsesto;
	@Column(name = "OraPalinsesto") 
    private  String oraPalinsesto;
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getIdCodiceFilm() {
		return idCodiceFilm;
	}
	public void setIdCodiceFilm(String idCodiceFilm) {
		this.idCodiceFilm = idCodiceFilm;
	}
	public int getIdSala() {
		return idSala;
	}
	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
	public int getIdCinema() {
		return idCinema;
	}
	public void setIdCinema(int idCinema) {
		this.idCinema = idCinema;
	}
	public String getDataPalinsesto() {
		return dataPalinsesto;
	}
	public void setDataPalinsesto(String dataPalinsesto) {
		this.dataPalinsesto = dataPalinsesto;
	}
	public String getOraPalinsesto() {
		return oraPalinsesto;
	}
	public void setOraPalinsesto(String oraPalinsesto) {
		this.oraPalinsesto = oraPalinsesto;
	}
	
	

}
