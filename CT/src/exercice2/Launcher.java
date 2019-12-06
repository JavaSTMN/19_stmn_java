package exercice2;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import exercice3.model.Scene;
import exercice3.view.SceneView;

public class Launcher extends JFrame {
	
	SceneView view;
	Scene model;
	
	public Launcher() {
		setTitle("Tree");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		model = new Scene();
		view = new SceneView(model);
		add(view);
	}

	public static void main(String[] args) {
		
		// Début de la création de l'objet Node de la figure 2.
		Node beastiary = new Node("Beastiary");

		Node uncommon = new Node("Uncommon");
		Node rare = new Node("Rare");
		Node legendary = new Node("Legendary");
		Node[] beastiaryChildren = { uncommon, rare, legendary };
		beastiary.addChildren(beastiaryChildren);
		
		Node brazenZealot = new Node("Brazen Zealot");
		Node murlocTidecaller = new Node("Murloc Tidecaller");
		Node[] uncommonChildren = { brazenZealot, murlocTidecaller };
		uncommon.addChildren(uncommonChildren);
		
		Node toxmonger = new Node("Toxmonger");
		rare.addChild(toxmonger);
		
		Node deathwing = new Node("Deathwing");
		legendary.addChild(deathwing);
		// Fin de la création de l'objet Node de la figure 2.
	}
}