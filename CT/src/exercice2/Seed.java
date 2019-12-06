package exercice2;

import java.util.ArrayList;

import exercice2.viewer.ITree;

public class Seed implements ITree {
	
	private String label;
	private ArrayList<Seed> elements;
	private Seed parent = null;
	
	public Seed() {
		this.elements = new ArrayList<Seed>();
	}
	
	public Seed(String label) {
		this.elements = new ArrayList<Seed>();
		this.label = label;
	}
	
	public Seed(String label, Seed[] elements) {
		this.elements = new ArrayList<Seed>();
		this.label = label;
		
		for(Seed element : elements) {
			this.elements.add(element);
		}
	}
	
	
	public void addElement(Seed element) {
		this.elements.add(element);
	}
	
	public void addElements(Seed[] elements) {
		for(Seed element : elements) {
			this.elements.add(element);
		}
	}
	
	Seed getElement(int index) throws Exception {
		if(index > this.elements.size() - 1) {
			throw new Exception("index inexistant");
		}
		return this.elements.get(index);
	}
	
	public int getNbElements() {
		return this.elements.size();
	}
	
	public String toString() {
		return label;
	}
	
	// MODIFS POUR TreeViewer
	
	public Seed getParent() {
		return this.parent;
	}

	@Override
	public Object getChild(Object parent, int index) {
		try {
			return this.getElement(index);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public int getChildCount(Object parent) {
		return this.getNbElements();
	}

	@Override
	public Object getRoot() {
		Seed ptr = this.parent;
		
		while(ptr.getParent() != null) {
			ptr = ptr.getParent();
		}
		
		return ptr;
	}
}
