package exercice2.viewer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class NodeTest {

	@Test
	void testAddChild() {
		Node test = new Node();
		test.name = "test";
		Node ch = new Node();
		ch.name = "child";
		
		test.addChild(ch);
		assertEquals(1,test.getNbChildren(), "test has one child: child");
		assertEquals("child",test.getChild(0).name, "child's name is child");
		
		test.addChild(test);
		assertEquals(2,test.getNbChildren(), "two children");
		assertEquals("child",test.getChild(0).name, "test's second child's is itself: test");
		
	}

	@Test
	void testAddChildren() {
		Node test = new Node();
		test.name = "test";
		
		Node ch1 = new Node();
		ch1.name = "child 1";
		Node ch2 = new Node();
		ch2.name = "child 2";
		Node ch3 = new Node();
		ch3.name = "child 3";
		
		Node[] children = new Node[] {ch1,ch2,ch3};
		test.addChildren(children);
		assertEquals(3,test.getNbChildren(), "3 children");
		assertEquals("child 1",test.getChild(0).name, "first child is child 1");
		assertEquals("child 2",test.getChild(1).name, "first child is child 2");
		assertEquals("child 3",test.getChild(2).name, "first child is child 3");
	}

}
