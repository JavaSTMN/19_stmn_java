package exercice4;

public class BilanAnnuel implements IBilan {
	
	String id;
	int annee;
	double resultatHT;
	double resultatTTC;
	String compte;
	
	public void editer() {
		
	}
	
	public IBilan voirBilan() {
		return this;
	}
	
	public int getAnnee() {
		return this.annee;
	}
}
