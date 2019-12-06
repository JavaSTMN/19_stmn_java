package exercice2;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class Node {
	
	/**
	 *  Réponse à la question 3 :
	 *  Il n'est pas possible de l'utiliser en l'état avec la classe Node parce qu'il n'y a pas de quoi ajouter un noeud à l'arbre.
	 */
	
	/**
	 * Réponse à la question 4 :
	 * Il faudrait ajouter une méthode addLeaf(Object child) à l'interface ITree, le paramètre "child" étant un noeud à ajouter, dans notre contexte.
	 * Ou alors il faurait ajouter une méthode à la classe Node pour ajouter un enfant à un arbre.
	 */
	
	private String name;
	
	private Node[] children;
	
	public Node(String name) {
		this.name = name;
		this.children = new Node[0];
	}
	
	public void addChild(Node child) {
		int size = this.children.length;
		Node[] newChildren = new Node[size + 1];
		for (int i = 0; i < size; i++) {
			newChildren[i] = this.children[i];
		}
		newChildren[size] = child;
		this.children = newChildren;
	}
	
	public void addChildren(Node[] children) {
		for (Node child : children) {
			this.addChild(child);
		}
	}
	
	public Node getChild(int index) {
		return this.children[index];
	}
	
	public int getNbChildren() {
		return this.children.length;
	}
	
	public void addToTree(JTree tree) {
		DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
	    DefaultMutableTreeNode root = (DefaultMutableTreeNode) tree.getModel().getRoot();
	    DefaultMutableTreeNode child = new DefaultMutableTreeNode(this);
	    model.insertNodeInto(child, root, root.getChildCount());
	    tree.scrollPathToVisible(new TreePath(child.getPath()));
	}
}