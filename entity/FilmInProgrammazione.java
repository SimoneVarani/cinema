package cinema.simone.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "film_in_programmazione")

public class FilmInProgrammazione {
	
	@Id @Column(name = "Codice") 
	    private String codice;
	    @Column(name="Titolo")
	    private String titolo;
	    @Column(name="Paese")
	    private String paese; 
	    @Column(name="Distribuzione")
	    private String distribuzione;
	    @Column(name="Genere")
	    private String genere;
	    @Column(name="Descrizione")
	    private String descrizione;
		public String getCodice() {
			return codice;
		}
		public void setCodice(String codice) {
			this.codice = codice;
		}
		public String getTitolo() {
			return titolo;
		}
		public void setTitolo(String titolo) {
			this.titolo = titolo;
		}
		public String getPaese() {
			return paese;
		}
		public void setPaese(String paese) {
			this.paese = paese;
		}
		public String getDistribuzione() {
			return distribuzione;
		}
		public void setDistribuzione(String distribuzione) {
			this.distribuzione = distribuzione;
		}
		public String getGenere() {
			return genere;
		}
		public void setGenere(String genere) {
			this.genere = genere;
		}
		public String getDescrizione() {
			return descrizione;
		}
		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}
	    
	    

}
