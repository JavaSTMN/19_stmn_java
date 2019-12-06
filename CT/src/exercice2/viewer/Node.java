package exercice2.viewer;

import java.util.ArrayList;

public class Node implements ITree{
	private String name;
	private int index = 0;
	ArrayList<Node> tree = new ArrayList<Node>(); 
	
	public Node(String name) {
		this.name = name;
		index++;
	}
	
	public void addChild(Node child) {
		tree.add(child);
	}
	
	public void addChildren(Node[] children) {
		for(int i=0; i<children.length;i++) {
			tree.add(children[i]);
		}
	}
	
	public Node getChild(int index) {
		return tree.get(index);
	}
	
	public int getNbChildren() {
		return tree.size();
	}
	
	public String toString() {
		return this.name;
	}

	@Override
	public Object getChild(Object parent, int index) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public int getChildCount(Object parent) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getRoot() {
		// TODO Auto-generated method stub
		return null;
	}
}
