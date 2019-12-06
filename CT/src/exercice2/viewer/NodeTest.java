package exercice2.viewer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class NodeTest {
	
	ArrayList<Node> nodes = new ArrayList<Node>();

	@Test
	void testAddChild() {
		Node n = new Node();
		nodes.add(n);
		Node.addChild(n);
		equals(nodes.equals(Node.nodes));
	}
	
	@Test
	void testAddChildren() {
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node[] all = {n1, n2, n3};
		nodes.add(n1);
		nodes.add(n2);
		nodes.add(n3);
		Node.addChildren(all);
		equals(nodes.equals(Node.nodes));
	}
	
	@Test
	void testGetChild() {
		//index of nodes begin at 0
		int index = 1;
		Node n1 = new Node();
		Node n2 = new Node();
		n1.name = "node 1";
		n2.name = "node 2";
		nodes.add(n1);
		nodes.add(n2);
		Node.addChild(n1);
		Node.addChild(n2);
		
		assertEquals(nodes.get(index).toString(), Node.getChild(index).toString());
	}
	
	@Test
	void testGetNbChildren() {
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node[] all = {n1, n2, n3};
		nodes.add(n1);
		nodes.add(n2);
		nodes.add(n3);
		Node.addChildren(all);
		assertEquals(nodes.size(), Node.getNbChildren());
	}
	
	@Test
	void testBeastiary() {
		Node n1 = new Node();
		n1.name = "Beastiary";
		Node n2 = new Node();
		n2.name = "Uncommon";
		Node n3 = new Node();
		n3.name = "Brazen zealot";
		Node n4 = new Node();
		n4.name = "Murloc Tidecaller";
		Node n5 = new Node();
		n5.name = "Rare";
		Node n6 = new Node();
		n6.name = "Toxmonger";
		Node n7 = new Node();
		n7.name = "Legendary";
		Node n8 = new Node();
		n8.name = "Deathwing";
	}

}
