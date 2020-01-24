package exercice3.model;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class Scene extends Observable {
	private final ArrayList<ISpaceObject> objects;
	private final Spacecraft spacecraft;
	private final Spacecraft spacecraft2;
	private final Dimension dimension;

	public Scene() {
		objects = new ArrayList<ISpaceObject>();
		dimension = new Dimension(500,500);
		spacecraft = new Spacecraft(dimension);
		spacecraft2 = new Spacecraft(dimension);
		add(spacecraft2);
		add(spacecraft);
		add(new Asteroid(dimension.width/4, dimension.width/4, dimension));
		add(new Asteroid(3*dimension.width/4, dimension.width/4, dimension));
		add(new Asteroid(dimension.width/4, 3*dimension.width/4, dimension));
	}
	public void add(ISpaceObject o) {
		objects.add(o);
	}
	
	public ArrayList<ISpaceObject> getObjects() {
		return objects;
	}
	
	public Spacecraft getSpacecraft() {
		return spacecraft;
	}
	
	public Dimension getDimension() {
		return dimension;
	}

	public void update(double period) {
		// Code permettant de mettre à jour le jeu
		Map<ISpaceObject, ArrayList<Point>> events = new HashMap<>();
		for (ISpaceObject object: objects) {
			ArrayList<Point> positions = new ArrayList<>();
			positions.add(new Point(object.getX(), object.getY()));
			object.move(period);
			positions.add(new Point(object.getX(), object.getY()));
			events.put(object, positions);
		}
		setChanged();
		notifyObservers();
	}
}
