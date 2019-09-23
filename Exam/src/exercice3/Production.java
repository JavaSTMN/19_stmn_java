package exercice3;

import java.util.ArrayList;

public class Production {
	
	public ArrayList<Forme> formes;
	
	public Production(ArrayList<Forme> liste) {
		this.formes = new ArrayList<Forme>();
		for (Forme forme : liste) {
			this.formes.add(forme);
		}	
	}
	
	public double calculAireJouet() throws Exception {
		double aireJouet = 0;
		for (Forme forme : this.formes) {
			aireJouet += forme.calculAire();
		}
		return aireJouet;
	}
	
	public String decrireJouet() {
		int nbTriangles = 0;
		int nbRectangles = 0;
		int nbCercles = 0;
		for (Forme forme : this.formes) {
			if (forme instanceof Triangle) {
				nbTriangles += 1;
			}
			if (forme instanceof Rectangle) {
				nbRectangles += 1;
			}
			if (forme instanceof Cercle) {
				nbCercles += 1;
			}
		}
		return "Cercles : " + nbCercles + " - Rectangles : " + nbRectangles + " - Triangles : " + nbTriangles;
	}
}
