package exercice3;

import java.util.ArrayList;

public class Jouet {
	private ArrayList<IFormes> composants;
	
	public Jouet(ArrayList<IFormes> composants) {
		this.composants = composants;
	}

	public double getAire() {
		double aire = 0;
		
		for (IFormes f: this.composants) {
			aire += f.getAire();
		}
		
		return aire;
	}
}
