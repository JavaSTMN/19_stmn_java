package exercice2.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import exercice1.Vector;

public class NodeTest {

	@Test
	void getNbChildrenTest() {
		// init 
		Node node = new Node();
		int expected = 0;
		
		// execute
		int result = node.getNbChildren();
		
		// test
		assertEquals(expected, result);	
	}
	
	@Test
	void addChildTest() {
		// init 
		Node node = new Node();
		int expected = 2;
		
		// execute
		node.addChild(new Node());
		node.addChild(new Node());
		int result = node.getNbChildren();
		
		// test
		assertEquals(expected, result);		
	}
	
	@Test
	void addChildrenTest() {
		// init 
		Node node = new Node();
		int expected = 3;
		
		// execute
		node.addChildren(new Node[] {new Node(), new Node(), new Node()});
		int result = node.getNbChildren();
		
		// test
		assertEquals(expected, result);		
	}
	
	@Test
	void getChildTest() {
		// init 
		Node node = new Node();
		Node expected = new Node();
		
		// execute
		node.addChildren(new Node[] {new Node(), new Node(), expected});
		Node result = node.getChild(2);
		
		// test
		assertEquals(expected, result);		
	}	
}
