package cinema.simone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "posto")
public class Posto {
	
	 
    @Id @Column(name = "Posto") 
    private String posto;
    @Column(name="Fila")
    private String fila;
    @Column(name="idSala")
    private int idSala;
    @Column(name="idPosto")
	private String idPosto;
	
	
	public String getFila() {
		return fila;
	}
	public void setFila(String fila) {
		this.fila = fila;
	}
	public String getPosto() {
		return posto;
	}
	public void setPosto(String posto) {
		this.posto = posto;
	}
	public int getIdsala() {
		return idSala;
	}
	public void setIdsala(int idsala) {
		this.idSala = idsala;
	}
	public String getIdPosto() {
		return idPosto;
	}
	public void setIdPosto(String idPosto) {
		this.idPosto = idPosto;
	}
	


}
