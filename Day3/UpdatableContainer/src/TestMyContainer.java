import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMyContainer {

	@Test
	void testAddNew() {
		MyContainer<MyObject> cont = new MyContainer<>();

		cont.add(new MyObject(1, 1));
		
		int expectedId = 1;
		int expectedVersion = 1;
		MyObject actual = cont.getElement(0);
		
		assertEquals(1, cont.getSize());
		assertEquals(expectedId, actual.id);
		assertEquals(expectedVersion, actual.version);
	}
	
	@Test
	void testAddUpdate() {
		MyContainer<MyObject> cont = new MyContainer<>(new MyObject[] {new MyObject(1, 1), new MyObject(2, 1)});

		cont.add(new MyObject(1, 3));
		
		int expectedId = 1;
		int expectedVersion = 3;
		MyObject actual = cont.getElement(0);
		
		assertEquals(2, cont.getSize());
		assertEquals(expectedId, actual.id);
		assertEquals(expectedVersion, actual.version);
	}

}
