package exercice2.viewer;

import javax.swing.JFrame;

import exercice2.back.Node;
import exercice2.back.Tree;

public class Launcher {
	
	public static void main(String[] args) {
		// create nodes
		Node root = new Node("Beastiary");
		
		Node n1 = new Node("Uncommon");
		n1.addChild(new Node("Brazen zealot"));
		n1.addChild(new Node("Murloc Tidecaller"));
		root.addChild(n1);
		
		Node n2 = new Node("Rare");
		n2.addChild(new Node("Toxmonger"));
		root.addChild(n2);
		
		Node n3 = new Node("Legendary");
		n3.addChild(new Node("Deathwing"));
		root.addChild(n3);
		
		// create tree
		Tree tree = new Tree(root);
		
		// render tree
		JFrame f = new JFrame();
		TreeViewer tw = new TreeViewer(tree);
		f.add(tw);
		f.setSize(200,200);
		f.setVisible(true);
		
	}
	
}
