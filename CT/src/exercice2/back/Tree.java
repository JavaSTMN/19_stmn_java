package exercice2.back;

import exercice2.viewer.ITree;

public class Tree implements ITree {

	Node root;
	
	public Tree(Node root) {
		this.root = root;
	}
	
	@Override
	public Object getChild(Object parent, int index) {
		Node parentAsNode = (Node) parent;
		return parentAsNode.getChild(index);
	}

	@Override
	public int getChildCount(Object parent) {
		Node parentAsNode = (Node) parent;
		return parentAsNode.getNbChildren();
	}

	@Override
	public Object getRoot() {
		return root;
	}

}
