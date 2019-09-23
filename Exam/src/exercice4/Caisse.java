package exercice4;

import java.util.Map;

public class Caisse {
	
	public enum compteEnum{
		papeterie,
		presse,
		livres,
	}
	
	Map<Vente, Article> ventes; 
	Article[] articles;
	BilanMensuel[] bilansM;
	BilanAnnuel[] bilansA;
	
	public BilanMensuel getBilanMensuel(int mois, int annee) {
		for(BilanMensuel bilan: bilansM) {
			if(bilan.getMois() == mois && bilan.getAnnee() == annee) {
				return bilan;
			}
		}
		
		return null;
	}
	
	public BilanAnnuel getBilanAnnuel(int annee) {
		for(BilanAnnuel bilan: bilansA) {
			if(bilan.getAnnee() == annee) {
				return bilan;
			}
		}
		
		return null;
	}
	
	public void enregistrerVente(Article article, Vente vente) {
		ventes.put(vente, article);
	}
	
}
