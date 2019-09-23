package exercice3;

import java.util.ArrayList;

public class Toy extends Form{
	private ArrayList<Form> elements = new ArrayList<Form>();

	public Toy(String description) throws Exception {
		super(description);
	}
	
	public void add(Form form) {
		this.elements.add(form);
	}

	public void delete(Form form) {
		this.elements.remove(form);
	}

	@Override
	void calcArea() throws Exception {
		double sumArea = 0;
		for(Form elt : elements) {
			sumArea += elt.getArea();
		}	
		this.setArea(sumArea);
		if(sumArea == 0) {
			throw new Exception("There is 0 element");
		}
	}

	public ArrayList<Form> getElements() {
		return elements;
	}

	public void setElements(ArrayList<Form> elements) {
		this.elements = elements;
	}
	

	
	
}
