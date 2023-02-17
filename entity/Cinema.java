package cinema.simone.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "cinema")

public class Cinema {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)//Auto increment keys for DB
	    @Column(name = "id") 
	    private Integer id;
	    @Column(name="Nome")
	    private String nome;
	    @Column(name="Citta")
	    private String citta;
	    @Column(name="Indirizzo")
		private String indirizzo;
	    @Column(name="NumeroSale")
		private int numeroSale;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCitta() {
			return citta;
		}
		public void setCitta(String citta) {
			this.citta = citta;
		}
		public String getIndirizzo() {
			return indirizzo;
		}
		public void setIndirizzo(String indirizzo) {
			this.indirizzo = indirizzo;
		}
		public int getNumeroSale() {
			return numeroSale;
		}
		public void setNumeroSale(int numeroSale) {
			this.numeroSale = numeroSale;
		}
	    
	    
	    
}
