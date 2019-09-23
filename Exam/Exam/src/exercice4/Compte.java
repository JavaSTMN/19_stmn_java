package exercice4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;

public class Compte {
	
	private final Hashtable<String, Vente> listeventes = new Hashtable<>();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	
	public void add(Vente vente) {
		listeventes.put(vente.id,vente);
	}
	
	public String editMonth(String mois) {
		
		double sommeHT = 0;
		double sommeTTC = 0;
		for(Vente l:listeventes.values()) {
			//if(l.date.getMonth()==(date.getMonth())) { sommeHT = sommeHT+l.article.prix ;}	
			if(l.mois==mois) {sommeHT = sommeHT+l.article.prix ;}
		}
		sommeTTC = sommeHT *0.80;
		return "sommeTTC:"+ sommeTTC +"sommeHT:" + sommeHT;
	}
	
	public String editYear(int annee) {
		
		double sommeHT = 0;
		double sommeTTC = 0;
		for(Vente l:listeventes.values()) {
			//if(l.date.getYear()==(date.getYear())) { sommeHT = sommeHT+l.article.prix ;}
			if(l.annee==annee) {sommeHT = sommeHT+l.article.prix ;}
		}
		sommeTTC = sommeHT *0.80;
		return "sommeTTC:"+ sommeTTC +"sommeHT:" + sommeHT;
	}

}
