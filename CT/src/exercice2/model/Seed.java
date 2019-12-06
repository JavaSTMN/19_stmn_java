package exercice2.model;

import java.util.ArrayList;

public class Seed {
	private String label;
	private ArrayList<Seed> elements;
	
	public Seed(String l) {
		this.label = l;
		this.elements = new ArrayList<Seed>();
	}
	
	public void addElement(Seed element) {
		this.elements.add(element);
	}
	
	public void addElements(Seed[] elements) {
		for(Seed e : elements) {
			this.elements.add(e);		
		}
	}
	
	Seed getElement(int index) {
		return this.elements.get(index);
	}
	int getNbElements() {
		return this.elements.size();
	}
	public String toString() {
		return label;
	}

	
}
