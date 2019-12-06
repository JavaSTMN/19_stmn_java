package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NodeTest {

	@Test
	void testAddChild() {
		Node root = new Node("Root");
		root.addChild(new Node("Child1"));
		int expected = 1;
		try {
			assertEquals(expected, root.getNbChildren());
		} catch(Exception e) {
			fail("Test should not throw");
		}
	}
	
	@Test
	void testAddChildren() {
		Node root = new Node("Root");
		Node child1 = new Node("Child 1");
		Node child2 = new Node("Child 2");
		Node[] children = { child1, child2 };
		root.addChildren(children);
		int expected = 2;
		try {
			assertEquals(expected, root.getNbChildren());
		} catch(Exception e) {
			fail("Test should not throw");
		}
	}
	
	@Test
	void testGetChild() {
		Node root = new Node("Root");
		Node child1 = new Node("Child 1");
		Node child2 = new Node("Child 2");
		Node[] children = { child1, child2 };
		root.addChildren(children);
		Node expected = child2;
		try {
			assertEquals(expected, root.getChild(1));
		} catch(Exception e) {
			fail("Test should not throw");
		}
	}
	
	@Test
	void testGetNbChildren() {
		Node root = new Node("Root");
		Node child1 = new Node("Child 1");
		Node child2 = new Node("Child 2");
		Node[] children = { child1, child2 };
		root.addChildren(children);
		int expected = 2;
		try {
			assertEquals(expected, root.getNbChildren());
		} catch(Exception e) {
			fail("Test should not throw");
		}
	}
}