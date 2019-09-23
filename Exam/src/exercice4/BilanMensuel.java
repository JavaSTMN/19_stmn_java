package exercice4;

import java.util.Date;

public class BilanMensuel implements IBilan {
	
	String id;
	int mois;
	int annee;
	double resultatHT;
	double resultatTTC;
	String compte;
	
	public void editer() {
		
	}
	
	public IBilan voirBilan() {
		
		return this;
	}
	
	public int getMois() {
		return this.mois;
	}
	
	public int getAnnee() {
		return this.annee;
	}
	
	
}
