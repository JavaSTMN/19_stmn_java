package exercice2.viewer;

import javax.swing.JFrame;

import exercice2.Node;
import exercice2.TreeAdapter;

public class Launcher {

	public static void main(String[] argv) {
		JFrame main = new JFrame("Launcher");
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Node root = new Node("Beastiary");
		
		Node uncommon = new Node("Uncommon");
		uncommon.addChildren(new Node[] {new Node("Brazen zealot"), new Node("Murloc Tidecaller")});
		
		Node rare = new Node("Rare");
		rare.addChildren(new Node[] {new Node("Toxmonger")});
		
		Node legendary = new Node("Legendary");
		legendary.addChildren(new Node[] {new Node("Deathwing")});
		
		root.addChildren(new Node[] {uncommon, rare, legendary});
		
		System.out.println(root.serialize());
		
		TreeViewer viewer = new TreeViewer(new TreeAdapter(root));
		for (int i=0; i<viewer.getRowCount(); ++i) {
			viewer.expandRow(i);
		}
		main.add(viewer);
		
		main.pack();
		main.setVisible(true);
	}
	
}
