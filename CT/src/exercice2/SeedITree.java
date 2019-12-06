package exercice2;

import exercice2.viewer.ITree;

public class SeedITree extends Seed implements ITree {

	public SeedITree(String label) {
		super(label);
	}

	@Override
	public Object getChild(Object parent, int index) {
		try {
			return this.getElement(index);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public int getChildCount(Object parent) {
		return this.getNbElements();
	}

	@Override
	public Object getRoot() {
		return this;
	}

}
