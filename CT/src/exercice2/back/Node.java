package exercice2.back;

import java.util.ArrayList;

import exercice2.viewer.ITree;

public class Node {
	private String name;
	private ArrayList<Node> children;
	
	public Node() {
		this.children = new ArrayList<Node>();
	}
	
	public Node(String name) {
		this.children = new ArrayList<Node>();
		this.name = name;
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
