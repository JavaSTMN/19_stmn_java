package ex3;

public class Jouet {
	double aire;
	private Forme[] composants;
	public Jouet (Forme[] mesComposants) {
		composants = mesComposants;
	}
	public void calcAire() {
		aire = 0;
		for (int i = 0; i<composants.length; i++) {
			composants[i].calcaire();
			aire += composants[i].aire;
		}
	}
}
