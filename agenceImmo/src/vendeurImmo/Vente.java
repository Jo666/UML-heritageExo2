package vendeurImmo;
import java.util.Date;

import produitImmo.Bien;


public class Vente {
	private Bien bien;
	private Double montant;
	private Date date;
	
	public Vente(Bien bien_v, Double prix_v, Date date_v) {
		this.bien = bien_v;
		this.montant = prix_v;
		this.date = date_v;
	}

	protected  Double getMontant() {
		return montant;
	}
	
	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	protected Bien getBien() {
		return bien;
	}

}
