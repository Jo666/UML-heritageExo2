package produitImmo;

public class Appartement extends Bien {
	
	Integer etageSituation;

	public Appartement(Integer id, String nom_p, String tel_p, String addr_p, Integer nP, Double montantPrev,
			 Integer nEtage) {
		super(id, nom_p, tel_p, addr_p, nP, montantPrev);
		this.etageSituation= nEtage;
	}
	
	@Override
	public Double getFrais() {
		return 0.03;
	}

}
