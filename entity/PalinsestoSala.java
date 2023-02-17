package cinema.simone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "palinsestoSala")

public class PalinsestoSala {
	
	@Id @Column(name = "idPalinsesto") 
    private  String idPalinsesto;
	@Column(name = "idSala") 
    private  int idSala;
	public String getIdPalinsesto() {
		return idPalinsesto;
	}
	public void setIdPalinsesto(String idPalinsesto) {
		this.idPalinsesto = idPalinsesto;
	}
	public int getIdSala() {
		return idSala;
	}
	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
	
	
}
