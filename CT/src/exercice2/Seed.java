package exercice2;

import java.util.ArrayList;
import java.util.Arrays;

public class Seed {
	private String label;
	private ArrayList<Seed> elements;

	public Seed(String label) {
		this.label = label;
		this.elements = new ArrayList<Seed>();
	}

	public void addElement(Seed element) {
		this.elements.add(element);
	}

	public void addElements(Seed[] elements) {
		this.elements.addAll(Arrays.asList(elements));
	}

	public Seed getElement(int index) throws Exception {
		if (index >= this.elements.size() || index < 0)
			throw new Exception("Index " + index + " is out of bounds");
		return this.elements.get(index);
	}

	public int getNbElements() {
		return this.elements.size();
	}

	public String toString() {
		return this.label;
	}

	public String serialize() {
		String json = "{";
		json += "label:" + this.label + ",";
		json += "childrenNumber:" + this.getNbElements() + ",";
		json += "children:[";
		for (int i = 0; i < this.getNbElements(); ++i) {
			try {
				json += this.getElement(i).serialize() + ", ";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (this.getNbElements() > 0) {
			json = json.substring(0, json.length() - 1);
		}

		json += "]}";
		return json;
	}
}
