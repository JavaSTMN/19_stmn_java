package setup.src.exercice3.model;

import java.util.Observable;

public class Scene extends Observable {
	private final Spacecraft spacecraft;

	public Scene() {
		spacecraft = new Spacecraft();
	}

	public Spacecraft getSpacecraft() {
		return spacecraft;
	}

	public void update(double period) {
		// TODO Fill me
		setChanged();
		notifyObservers();
	}
}
