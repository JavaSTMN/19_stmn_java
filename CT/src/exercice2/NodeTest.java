package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NodeTest {

	@Test
	void testAddChild() {
		Node root = new Node("root");
		Node child = new Node("child");
		
		root.addChild(child);
		
		assertEquals(1, root.children.size());
		assertEquals(child, root.children.get(0));
	}
	
	@Test
	void testAddChildren() {
		Node root = new Node("root");
		Node child0 = new Node("child1");
		Node child1 = new Node("child2");
		
		root.addChildren(new Node[] {child0, child1});
		
		assertEquals(2, root.children.size());
		assertEquals(child0, root.children.get(0));
		assertEquals(child1, root.children.get(1));
	}

	@Test
	void testGetChild() {
		Node root = new Node("root");
		Node child = new Node("child");
		root.children.add(child);
		
		assertEquals(child, root.getChild(0));
	}
	
	@Test
	void testGetChildError() {
		Node root = new Node("root");
		Node child = new Node("child");
		root.children.add(child);
		
		assertThrows(Exception.class, () -> { root.getChild(1); } );
	}
	
	@Test
	void testGetNbChildren() {
		Node root = new Node("root");
		Node child = new Node("child");
		root.children.add(child);
		
		assertEquals(1, root.getNbChildren());
	}
	
}
