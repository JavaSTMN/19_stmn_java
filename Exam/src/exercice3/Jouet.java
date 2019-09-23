package exercice3;

import java.util.ArrayList;

public class Jouet {
	
	private IFormeElementaire[] formes;
	private int nbFormes;
	
	public Jouet (IFormeElementaire[] _formes) {
		this.formes = _formes;
	}
	
	public String description() {
		
		String description = "";
		
		for(IFormeElementaire forme : formes) {
			description += forme.toString();
			description += " ";
		}
		
		return description;
	}
	
	public double calculAire() {
		double aireTotale = 0;
		
		for(IFormeElementaire forme : formes) {
			aireTotale += forme.calculAire();
		}
		
		return aireTotale;
	}
}
