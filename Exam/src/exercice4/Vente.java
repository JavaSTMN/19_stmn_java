package exercice4;

public class Vente {
	public float enregistrerVente(Caisse caisse) throws Exception {
		caisse.gestionStock(caisse);
		float prixTTC = (float) (caisse.prixHT * 1.2);
		
		return prixTTC;
	}
}
