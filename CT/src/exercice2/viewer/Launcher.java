package exercice2.viewer;

public class Launcher {

	public static void main (String[] args)
	{
		Node beastiary = new Node("Beastiary");
		Node[] nodeTab = {new Node("Uncommon"), new Node("Rare"), new Node("Legendary")};
//		Node uncommon = new Node("Uncommon");
//		Node rare = new Node("Rare");
//		Node legendary = new Node("Legendary");
		
		beastiary.addChildren(nodeTab);
//		System.out.println(beastiary.getChild(0).toString());
		beastiary.getChild(0).addChild(new Node("Brazen zealot"));
		beastiary.getChild(0).addChild(new Node("Murloc Tidecaller"));
		beastiary.getChild(1).addChild(new Node("Toxmonger"));
		beastiary.getChild(2).addChild(new Node("Deathwing"));
		
		
		TreeViewer tv = new TreeViewer(beastiary);
		System.out.print(tv);
	}
}
