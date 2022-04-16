package produitImmo;

public abstract class Bien {
	private Integer id, nPieces;
	private String nom_prop, tel_prop, add_prop;
	private Double prixAnnonce;
	public abstract Double getFrais();

	public Bien(Integer id, String nom_p, String tel_p, String addr_p, Integer nP, Double montantPrev) {
		this.id = id;
		this.nom_prop = nom_p;
		this.tel_prop = tel_p;
		this.add_prop = addr_p;
		this.nPieces = nP;	
	}	
}
