package appliMain;

import java.util.Date;


import produitImmo.*;
import vendeurImmo.*;

public class Appli {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Agence cent21 = new Agence("Century 21");
		
		System.out.println("23:59 : Century 21 a fait " + cent21.getCA() + " € de CA.");
		
		Bien home_1_FromZorro = new Maison(1, "zorro", "07.xx", "2 rue des moustaches", 5, 275000., 2, false);
		
		// 3)a) enregistrer la mise en vente d'un bien
		cent21.mettreEnVente(home_1_FromZorro);
		// 3)b) enregistrer la vente d'un bien
		cent21.vendre(home_1_FromZorro,250000.);
		// 3)c) calculer les frais d'agence sur la vente d'un bien
		System.out.println("00:00 : Les frais d'agence sont de " + cent21.getCA(home_1_FromZorro) + " € pour la vente de home_1_FromZorro");
		
		Bien app_1_FromBatman = new Appartement(1, "batman", "06.xx", "6 rue des chauve-souris", 15, 425000., 3);
		cent21.mettreEnVente(app_1_FromBatman);
		cent21.vendre(app_1_FromBatman,400000.);
		
		Bien home_2_FromGoldorak = new Maison(2, "goldorak", "06.xx", "1 rue des lasers", 89, 1150000.15, 4, true);
		cent21.mettreEnVente(home_2_FromGoldorak);
		cent21.vendre(home_2_FromGoldorak,1156660.);
		
		Bien app_2_FromSpiderman = new Appartement(2, "spiderman", "04.xx", "12 rue des araignées", 2, 125000., 17);
		cent21.mettreEnVente(app_2_FromSpiderman);
		cent21.vendre(app_2_FromSpiderman,120000.);
		
		
		// 3)d) calculer le chiffre d'affaire de l'agence sur une période donnée
		System.out.println("00:01 : Century 21 a fait " + cent21.getCA(new Date(2022, 10, 01),new Date(2022, 11, 01)) + " € de CA entre le 01/10/2022 et le 01/11/2022.");
		
		// calcul le CA global
		System.out.println("00:02 : Century 21 a fait " + cent21.getCA() + " € de CA.");
		
	}

}
