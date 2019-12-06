package exercice2.viewer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


class NodeTest {

	@Test
	void test() {
		Node racine = new Node("racine");
		Node children = new Node("fils");
		Node child1 = new Node("fils1");
		Node child2 = new Node("fils2");
		
		racine.addChild(children);
		children.addChild(child1);
		children.addChild(child2);
		
		String expected = "fils1";
		assertEquals(expected, child1.toString());
	}
	
	@Test
	void testNbChildren() {
		Node racine = new Node("racine");
		Node children = new Node("fils");
		Node child1 = new Node("fils1");
		Node child2 = new Node("fils2");
		
		racine.addChild(children);
		children.addChild(child1);
		children.addChild(child2);
		
		// J'arrive à récupérer les bonnes valeurs
		System.out.println(child1.toString());
		System.out.println(racine.getNbChildren());
		System.out.println(children.getChild(1));
		
		int expected = 2;
		assertEquals(expected, children.getNbChildren());
	}

	@Test
	void adddChildren() {
		Node racine = new Node("racine");
		Node parent = new Node("fils");
		Node[] childs = {new Node("fils1"), new Node("fils2")};
		
		racine.addChild(parent);
		parent.addChildren(childs);
		
		System.out.println(parent.getNbChildren());
		
		String expected = "fils1";
		assertEquals(expected, parent.getChild(0));
	}
	
}
