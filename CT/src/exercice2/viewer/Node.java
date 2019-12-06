package exercice2.viewer;

import java.util.ArrayList;

public class Node {
	public String name;
	
	private ArrayList<Node> listChildren = new ArrayList<Node>();
	
	public void addChild(Node child) {
		listChildren.add(child);
		return;
	}
	
	public void addChildren(Node[] children) {
		int i = 0;
		for (i=0;i<children.length;i++) {
			listChildren.add(children[i]);
		}
	}
	
	public Node getChild(int index) {
		return listChildren.get(index);
	}
	
	int getNbChildren() {
		return listChildren.size();
	}
}
