package vendeurImmo;
import java.util.ArrayList;

public class Agence {
	private String nom;
	private Double CA;
	private ArrayList <Vente> ventes; 
	
	
	public Agence(String nom) {
		this.nom = nom;
		ventes = new ArrayList<Vente>();
	}
	
	public ArrayList<Vente> getVentes() {
		return ventes;
	}

	
	public Double getCA () {
		Double sum = 0.;
		for (Vente v : ventes) sum += v.getMontant() * v.getBien().getFrais();
		return sum;
	}
	
}
