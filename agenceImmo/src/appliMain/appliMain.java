package appliMain;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import produitImmo.*;
import vendeurImmo.*;

public class Appli {

	public static void main(String[] args) {
		
		Agence cent21 = new Agence("Century 21");

		// maison1 dont le proprio est zorro à une adresse connue, comportant 5 pieces
		// 2 etages, mise en vente à un certain prix, non vendue pour l'instant
		Bien home_1_FromZorro = new Maison(1, "zorro", "07.xx", "2 rue des moustaches", 5, 275000., 2, false);
		
		// appartement1 dont le proprio est batman à une adresse connue, comportant 15 pieces
		// situé au 3ieme etage, mis en vente à un certain prix, non vendu pour l'instant
		Bien app_1_FromBatman = new Appartement(1, "batman", "06.xx", "6 rue des chauve-souris", 15, 425000., 3, false);
		
		// maison2 dont le proprio est goldorak à une adresse connue, comportant 89
		// pieces et 4 etages, déjà vendu au prix d'annonce
		Bien home_2_FromGoldorak = new Maison(2, "goldorak", "06.xx", "1 rue des lasers", 89, 1150000.15, 4, true);
		// nb biens vendus pour l'instant = 1

		home_1_FromZorro.estVendu(true, 250000.);
		app_1_FromBatman.estVendu(true, 400000.);
		// nb biens vendus = 3
		
		// nb biens vendus par Cent21 = 0
		System.out.println("23:59 : Century 21 a fait " + cent21.getCA() + " € de CA.");

		// on envoie nos ventes d'une liste à une autre
		List<Vente> source = Arrays.asList(home_1_FromZorro.getV(), app_1_FromBatman.getV(),
				home_2_FromGoldorak.getV());
		List<Vente> target = cent21.getVentes();
		// nb biens vendus par Cent21 = 3
		source.stream().forEachOrdered(target::add);

		// CA de cent21 = 515000.045
		System.out.println("00:00 : Century 21 a fait " + cent21.getCA() + " € de CA.");
		
		Bien app_2_FromSpiderman = new Appartement(2, "spiderman", "04.xx", "12 rue des araignées", 2, 125000., 17, false);
		Vente v1 = new Vente(app_2_FromSpiderman,101000.,new Date());
		// nb biens vendus = 4
		
		// nb biens vendus par Cent21 = 4
		cent21.getVentes().add(v1);
		
		// CA de cent21 = 545300.045
		System.out.println("00:01 : Century 21 a fait " + cent21.getCA() + " € de CA.");
		
	}

}
