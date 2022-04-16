package vendeurImmo;
import java.util.ArrayList;
import java.util.Date;

import produitImmo.Bien;

public class Agence {
	private String nom;
	private Double CA;
	private ArrayList <Bien> biens;
	private ArrayList <Vente> ventes; 
	
	
	public Agence(String nom) {
		this.nom = nom;
		this.biens = new ArrayList<Bien>();
		this.ventes = new ArrayList<Vente>();
	}
	
	
	public void mettreEnVente (Bien b) {this.biens.add(b);}
	
	public void vendre(Bien b, Double prix) {
		this.ventes.add(new Vente(b,prix,new Date()));
	}
	
	public Double getCA () {
		Double sum = 0.;
		for (Vente v : ventes) sum += v.getMontant() * v.getBien().getFrais();
		return sum;
	}
	
	public Double getCA (Bien b) {
		Double sum = 0.;
		for (Vente v : ventes) {
			if (v.getBien().equals(b))
			sum = v.getMontant() * v.getBien().getFrais();
		}
			
		return sum;
	}
	
	public Double getCA (Date d1, Date d2) {
		Double sum = 0.;
		for (Vente v : ventes) {
			if (d1.before(v.getDate()) && d2.after(v.getDate()) )
			sum += v.getMontant() * v.getBien().getFrais();
		}
			
		return sum;
	}
	
}
