package exercice4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaisseTest {

	@Test
	void test() {
		Compte papeterie = new Compte("papeterie");
		CompteManager.AjouterCompte(papeterie);
		Compte presse = new Compte("presse");
		CompteManager.AjouterCompte(presse);
		Compte livre = new Compte("livre");
		CompteManager.AjouterCompte(livre);
		
		Article asterix = new Article("Asterix", 7.99f);
		livre.addDisponibilite(asterix);
		Article boule = new Article("Boule&Bill", 5.99f);
		livre.addDisponibilite(boule);
		
		Article monde = new Article("Le Monde", 3.99f);
		presse.addDisponibilite(monde);
		
		Article parisien = new Article("Le Parisien", 20.99f);
		Vente venteParisien = new Vente(parisien);
		presse.addVente(venteParisien);
	}

}
