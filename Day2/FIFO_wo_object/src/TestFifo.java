import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFifo {

	@Test
	void testInit() throws Exception {
		Fifo f = new Fifo();
		int capacity = 10000;
		
		Fifo.init(f, capacity);
		
		assertEquals(0, f.size);
		assertEquals(capacity, f.capacity);
	}
	
	@Test
	void testPushNominal() throws Exception {
		Fifo f = new Fifo();
		f.elements = new int[] {2, 5, 0, 0, 0};
		f.capacity = f.elements.length;
		f.size = 2;
		
		Fifo.push(f, 42);
		
		int[] actualElements = new int[] {f.elements[0], f.elements[1], f.elements[2]};
		int[] expectedElements = new int[] {2, 5, 42};
		
		assertEquals(3, f.size);
		assertArrayEquals(expectedElements, actualElements);
	}
	
	@Test
	void testPopNominal() throws Exception {
		Fifo f = new Fifo();
		f.elements = new int[] {2, 5, 0, 0, 0};
		f.size = 2;
		
		int elt = Fifo.pop(f);
		
		int[] actualElements = new int[] {f.elements[0]};
		int[] expectedElements = new int[]  {5};
		
		assertEquals(2, elt);
		assertEquals(1, f.size);
		assertArrayEquals(expectedElements, actualElements);
	}
	
	@Test
	void testPushFull() throws Exception {
		Fifo f = new Fifo();
		f.elements = new int[] {2, 5};
		f.capacity = f.elements.length;
		f.size = 2;
		
		Throwable exception = assertThrows(Exception.class, () -> {
			Fifo.push(f, 42);
		});
		assertEquals("Max size reached. Cannot add more elements", exception.getMessage());
	}
	
	@Test
	void testPopEmpty() throws Exception {
		Fifo f = new Fifo();
		
		Throwable exception = assertThrows(Exception.class, () -> {
			Fifo.pop(f);
		});
		assertEquals("Fifo is empty", exception.getMessage());
	}

}
