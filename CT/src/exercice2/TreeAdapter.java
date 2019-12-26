package exercice2;

import exercice2.viewer.ITree;

public class TreeAdapter implements ITree {

	private final Node node;
	
	public TreeAdapter(Node node) {
		this.node = node;
	}
	
	@Override
	public Object getChild(Object parent, int index) {
		return ((Node) parent).getChild(index);
	}

	@Override
	public int getChildCount(Object parent) {
		return ((Node) parent).getNbChildren();
	}

	@Override
	public Object getRoot() {
		return node;
	}

}
