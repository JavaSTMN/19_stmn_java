package exercice2.viewer;

public interface ITree {
	Object getChild(Object parent, int index);
	int getChildCount(Object parent);
	Object getRoot();
}
