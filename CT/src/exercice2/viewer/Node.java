package exercice2.viewer;

import java.util.ArrayList;
import java.util.List;


// 3) On ne peut pas utiliser directement la classe Node avec Tree car elle ne possède aucune
// 		instance de Itree ou TreeViewer.
// 4) Pour faire fonctionner la classe Node avec Tree, il faut implémenter l'interface Itree.

public class Node implements ITree{
	String name;
	Node parent;
	boolean isRoot;
	List<Node> childrenList;
	
	public Node(String nodeName)
	{
		name = nodeName;
		parent = null;
		isRoot = true;
		childrenList = new ArrayList<Node>();
	}	
	
	public void addChild(Node child)
	{
		child.isRoot = false;
		child.parent = this;
		childrenList.add(child);
	}
	
	public void addChildren(Node[] children)
	{
		for(Node n : children)
		{
			this.addChild(n);
		}
	}
	
	public Node getChild(int index)
	{
		return childrenList.get(index);
	}
	
	public int getNbChildren()
	{
		return childrenList.size();
	}
	
	public String toString() 
	{
		return name;
	}

	@Override
	public Object getChild(Object parent, int index) {
		return this.getChild(index);
	}

	@Override
	public int getChildCount(Object parent) {
		return this.getNbChildren();
	}

	@Override
	public Object getRoot() {
		Node tmp = this;
		while(this.parent != null)
		{
			tmp = tmp.parent;
		}
		return tmp;
	}
}
