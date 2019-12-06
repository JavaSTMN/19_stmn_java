package exercice2.viewer;

import java.util.ArrayList;

public class Node {
	
	public static ArrayList<Node> nodes = new ArrayList<Node>();
	public String name;
	
	public static void addChild(Node child) {
		nodes.add(child);
	}
	
	public static void addChildren(Node[] children) {
		
	}
	
	public static Node getChild(int index) {
		return nodes.get(index);
	}
	
	public static int getNbChildren() {
		return nodes.size();
	}
	
	public String toString() {
		return name;
	}

}
