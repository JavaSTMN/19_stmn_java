package exercice3;

import java.util.ArrayList;
import java.util.List;

public class Toy {
	private List<IElementaryObject> cObjects;
	Toy(){
		this.cObjects = new ArrayList<IElementaryObject>();
	}
	public void addObject(IElementaryObject obj) {
		this.cObjects.add(obj);
	}
	public double getAreaOfToy() {
		double area =0;
		for(int i = 0; i< this.cObjects.size();i++) {
			area += this.cObjects.get(i).calculateArea();
		}
		return area;
	}
}
