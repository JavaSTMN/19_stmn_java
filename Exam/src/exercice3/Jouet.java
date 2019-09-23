package exercice3;

import java.util.ArrayList;
import java.util.List;

public class Jouet {
	protected List<Forme> listFormes = new ArrayList<Forme>();
	
	Jouet() {
		
	}
	
	public void add(Forme forme) {
		listFormes.add(forme);
	}
	
	public String Description() {
		String desc = "";
		for (int i=0; i<listFormes.size(); i++){
			desc += listFormes.get(i).type+";";
		}
		return desc;
	}
	
	public float CalculAire() {
		float aire = 0;
		for (int i=0; i<listFormes.size(); i++){
		   if (listFormes.get(i).type == "cercle") {
			   aire += Math.PI * (listFormes.get(i).rayon * listFormes.get(i).rayon);
		   } else if(listFormes.get(i).type == "triangle") {
			   aire += (listFormes.get(i).hauteur * listFormes.get(i).longueur)/2;
		   } else {
			   aire += listFormes.get(i).hauteur * listFormes.get(i).longueur;
		   }
		}
		return aire;
	}
}
