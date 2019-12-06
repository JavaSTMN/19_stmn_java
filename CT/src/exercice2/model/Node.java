package exercice2.model;

import java.util.ArrayList;

public class Node {
	private String name;
	private ArrayList<Node> children;
	
	public Node() {
		this.children = new ArrayList<Node>();
	}
	
	public void addChild(Node child) {
		this.children.add(child);
	}
	
	public void addChildren(Node[] children) {
		for (Node node : children) {
			this.addChild(node);
		}
	}
	
	public Node getChild(int index) {
		return this.children.get(index);
	}
	
	public int getNbChildren() {
		return this.children.size();
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
