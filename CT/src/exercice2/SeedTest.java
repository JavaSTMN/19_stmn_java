package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SeedTest {

	

	@Test
	void test_addElement_normal() {
		Seed seedRoot = new Seed("root");
		Seed seedChild1 = new Seed("child1");
		Seed seedChild1Child = new Seed("child1child");
		Seed seedChild2 = new Seed("child2");

		// 0 element
		assertEquals(0, seedRoot.getNbElements(), "");

		seedRoot.addElement(seedChild1);

		// 1 element
		assertEquals(1, seedRoot.getNbElements(), "");

		seedChild1.addElement(seedChild1Child);
		// toujours 1 element
		assertEquals(1, seedChild1.getNbElements(), "");

		// 2 elements
		seedRoot.addElement(seedChild2);
		assertEquals(2, seedRoot.getNbElements(), "");
	}

	@Test
	void test_addElements_normal() {
		Seed seedRoot = new Seed("root");
		Seed seedChild1 = new Seed("child1");
		Seed seedChild1Child = new Seed("child1child");
		Seed seedChild2 = new Seed("child2");

		seedChild1.addElements(new Seed[] { seedChild1Child });
		try {
			String child1ChildName = seedChild1.getElement(0).toString();
			assertEquals("child1child", child1ChildName);
		} catch (Exception e) {
			fail("Should not throw exception");
		}

		seedRoot.addElements(new Seed[] { seedChild1, seedChild2 });

		assertEquals(2, seedRoot.getNbElements());
		assertEquals(1, seedChild1.getNbElements());
	}

	@Test
	void test_getElement() {
		Seed seedRoot = new Seed("root");
		assertThrows(Exception.class, () -> {
			seedRoot.getElement(0);
		});
		assertThrows(Exception.class, () -> {
			seedRoot.getElement(-1);
		});

		seedRoot.addElements(new Seed[] { new Seed("child1"), new Seed("child2") });

		try {
			assertEquals("child2", seedRoot.getElement(1).toString(), "");
		} catch (Exception e) {
			fail("Should not throw exception");
		}

	}
	/*
	 * @Test void test_addElement_addNonOrphanedElement() { Seed seedRoot = new
	 * Seed("root"); Seed seedChild1 = new Seed("child1"); Seed seedChild1Child =
	 * new Seed("child1child");
	 * 
	 * seedChild1.addElement(seedChild1Child); seedRoot.addElement(seedChild1);
	 * 
	 * // seedChild1Child is already somewhere assertThrows(Exception.class, () -> {
	 * seedRoot.addElement(seedChild1Child); }); }
	 */

}
