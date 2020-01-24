package exercice3.model;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class Scene extends Observable {
	private final ArrayList<ISpaceObject> objects;
	private final ArrayList<ISpaceObject> objects2;
	private final Spacecraft spacecraft;
	private final Spacecraft spacecraft2;
	private final Dimension dimension;

	public Scene() {
		objects = new ArrayList<ISpaceObject>();
		objects2 = new ArrayList<ISpaceObject>();
		dimension = new Dimension(500,500);
		spacecraft = new Spacecraft(dimension);
		spacecraft2 = new Spacecraft(dimension);
		add(spacecraft);
		add2(spacecraft2);
		add(new Asteroid(dimension.width/4, dimension.width/4, dimension));
		add(new Asteroid(3*dimension.width/4, dimension.width/4, dimension));
		add(new Asteroid(dimension.width/4, 3*dimension.width/4, dimension));
	}
	public void add(ISpaceObject o) {
		objects.add(o);
	}
	public void add2(ISpaceObject o) {
		objects2.add(o);
	}
	
	public ArrayList<ISpaceObject> getObjects() {
		return objects;
	}
	public ArrayList<ISpaceObject> getObjects2() {
		return objects2;
	}
	
	public Spacecraft getSpacecraft() {
		return spacecraft;
	}
	public Spacecraft getSpacecraft2() {
		return spacecraft2;
	}
	
	public Dimension getDimension() {
		return dimension;
	}

	public void update(double period) {
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
