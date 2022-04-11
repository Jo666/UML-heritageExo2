package produitImmo;
import java.util.Date;

import vendeurImmo.Vente;

public abstract class Bien {
	private Integer id, nPieces;
	private String nom_prop, tel_prop, add_prop;
	private Double prixAnnonce, prixVente, frais;
	private Boolean estVendu;
	private Vente v;
	public abstract Double getFrais();

	public Bien(Integer id, String nom_p, String tel_p, String addr_p, Integer nP, Double montantPrev,
			Boolean vendu) {
		this.id = id;
		this.nom_prop = nom_p;
		this.tel_prop = tel_p;
		this.add_prop = addr_p;
		this.nPieces = nP;
		this.v = new Vente(this, null, null);
		estVendu(vendu,montantPrev);
	}

	public void estVendu(Boolean vendu, Double prix) {
		this.estVendu = vendu;
		if (estVendu) fixPrixVente(prix);
		else this.prixAnnonce = prix;	
	}

	
	public Vente getV() {return v;}

	private void fixPrixVente(Double prix) {
		this.prixVente = prix;
		v.setMontant(prixVente);
		v.setDate(new Date());	
	}
}
