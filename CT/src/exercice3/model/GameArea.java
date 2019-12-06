package exercice3.model;

import java.util.Observable;

public class GameArea extends Observable  {
	private final Shuttle shuttle;

	public GameArea() {
		shuttle = new Shuttle();
	}

	public Shuttle getShuttle() {
		return shuttle;
	}

	public void update(double period) {
		// TODO Fill me
		setChanged();
		notifyObservers();
	}
	
}
