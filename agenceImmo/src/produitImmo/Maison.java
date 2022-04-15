package produitImmo;

public class Maison extends Bien {

	Integer nbEtage;
	
	public Maison(Integer id, String nom_p, String tel_p, String addr_p, Integer nP, Double montantPrev,
			 Integer nEtage) {
		super(id, nom_p, tel_p, addr_p, nP, montantPrev);
		this.nbEtage = nEtage;
	}
	
	@Override
	public Double getFrais() {
		return 0.2;
	}

}
