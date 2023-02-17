package cinema.simone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prenotazione")

public class Prenotazione {
	
	@Id @Column(name = "idPrenotazione")
	private String idPrenotazione;
	@Column(name = "DataPrenotazione")
	private String dataPrenotazione;
	@Column (name = "Pagamento")
	private int pagamento;
	@Column (name = "idPosto")
	private String idPosto;
	@Column(name = "idUtente")
	private String idUtente;
	@Column(name = "idCodicePalinsesto")
	private String idCodicePalinsesto;
	public String getIdPrenotazione() {
		return idPrenotazione;
	}
	public void setIdPrenotazione(String idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}
	public String getDataPrenotazione() {
		return dataPrenotazione;
	}
	public void setDataPrenotazione(String dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}
	public int getPagamento() {
		return pagamento;
	}
	public void setPagamento(int pagamento) {
		this.pagamento = pagamento;
	}
	public String getIdPosto() {
		return idPosto;
	}
	public void setIdPosto(String idPosto) {
		this.idPosto = idPosto;
	}
	public String getIdUtente() {
		return idUtente;
	}
	public void setIdUtente(String idUtente) {
		this.idUtente = idUtente;
	}
	public String getIdCodicePalinsesto() {
		return idCodicePalinsesto;
	}
	public void setIdCodicePalinsesto(String idCodicePalinsesto) {
		this.idCodicePalinsesto = idCodicePalinsesto;
	}
	
	


}
