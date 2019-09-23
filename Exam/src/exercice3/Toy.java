package exercice3;

import java.util.ArrayList;

public class Toy<T extends Form>{
	
	ArrayList<T> forms;
	//a une liste de forme élémentaires
	//calculer l'aire totale des formes
	
	public Toy() {
		this.forms = new ArrayList<>();
	}
	
	public double calcTotalAreas() throws Exception {
		if(forms.size() == 0) {
			throw new Exception("There is no form yet");
		}
		double sum = 0;
		
		for(T form: forms) {
			sum += form.calcArea();
		}
		
		return sum;
	}

}
