package setup.src.exercice2.viewer;

public class Node {
	private String name;
	
	void addChild(Node child) {
		getChild(child);
		
	}

	void addChildren(Node[] children) {
		
	}
	
	Node getChild(Node index) {
		
		return index;
	}
	
	int getNbChildren() {
		
		return 0;
	}
	
	public String toString() {
		
		return name; 
	}
}
