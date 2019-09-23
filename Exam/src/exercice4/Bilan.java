package exercice4;

import java.util.*;

public class Bilan {

	private HashMap<Date, Article> ventes;
	
	public Bilan() {
		ventes = new HashMap<Date, Article>();
	}
	
	public Bilan(HashMap<Date, Article> ventesDejaFaites) {
		ventes = ventesDejaFaites;
	}
	
	public void addVente(Date date, Article article) {
		this.ventes.put(date, article);
	}

	// return somme des prixHT des ventes du mois de l'année donnée
	public double getResultatMoisHT(int mois, int annee) {
		double sum = 0;
		
		Iterator it = ventes.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();

			// change l'article associé à la date donnée
	        if(((Date) pair.getKey()).getYear() == annee && ((Date) pair.getKey()).getMonth() == mois) {
	        	sum += ((Article) pair.getValue()).getPrixHT();
	        }
	        
	        it.remove();
	    }
	    
	    return sum;
	}

	// return somme des prixTTC des ventes du mois de l'année donnée
	public double getResultatMoisTTC(int mois, int annee) {
		double sum = 0;
		
		Iterator it = ventes.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();

			// change l'article associé à la date donnée
	        if(((Date) pair.getKey()).getYear() == annee && ((Date) pair.getKey()).getMonth() == mois) {
	        	sum += ((Article) pair.getValue()).getPrixTTC();
	        }
	        
	        it.remove();
	    }
	    
	    return sum;
	}

	// return somme des prixHT des ventes de l'année donnée
	public double getResultatAnneeHT(int annee) {
		double sum = 0;
		
		Iterator it = ventes.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();

			// change l'article associé à la date donnée
	        if(((Date) pair.getKey()).getYear() == annee) {
	        	sum += ((Article) pair.getValue()).getPrixHT();
	        }
	        
	        it.remove();
	    }
	    
	    return sum;
	}

	// return somme des prixTTC des ventes de l'année donnée
	public double getResultatAnneeTTC(int annee) {
		double sum = 0;
		
		Iterator it = ventes.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();

			// change l'article associé à la date donnée
	        if(((Date) pair.getKey()).getYear() == annee) {
	        	sum += ((Article) pair.getValue()).getPrixTTC();
	        }
	        
	        it.remove();
	    }
	    
	    return sum;
	}
	
	public void editVente(Date date, Article newArticle) {
		Iterator it = ventes.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();

			// change l'article associé à la date donnée
	        if(pair.getKey() == date) {
	        	ventes.put(date, newArticle);
	        }
	        
	        it.remove();
	    }
	}
	
	public void deleteVente(Date date) {
		Iterator it = ventes.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();

			// supprime l'article associé à la date donnée de la map 
	        if(pair.getKey() == date) {
	        	ventes.remove(date);
	        }
	        
	        it.remove();
	    }
	}
		
}
