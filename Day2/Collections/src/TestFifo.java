import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFifo {
	
	@Test
	void testPushNominal() throws Exception {
		Fifo f = new Fifo(5, new int[] {2, 5});
		
		f.push(42);
		
		int[] actualElements = new int[f.getSize()];
		for (int i=0; i < actualElements.length; ++i) {
			actualElements[i] = f.getElement(i);
		}
		int[] expectedElements = new int[] {2, 5, 42};
		
		assertEquals(3, f.getSize());
		assertArrayEquals(expectedElements, actualElements);
	}
	
	@Test
	void testPopNominal() throws Exception {
		Fifo f = new Fifo(5, new int[] {2, 5});
		
		int elt = f.pop();
		
		int[] actualElements = new int[f.getSize()];
		for (int i=0; i < actualElements.length; ++i) {
			actualElements[i] = f.getElement(i);
		}
		int[] expectedElements = new int[]  {5};
		
		assertEquals(2, elt);
		assertEquals(1, f.getSize());
		assertArrayEquals(expectedElements, actualElements);
	}
	
	@Test
	void testPushFull() throws Exception {
		Fifo f = new Fifo(2, new int[] {2, 5});
		
		Throwable exception = assertThrows(Exception.class, () -> {
			f.push(42);
		});
		assertEquals("Max size reached. Cannot add more elements", exception.getMessage());
	}
	
	@Test
	void testPopEmpty() throws Exception {
		Fifo f = new Fifo(5);
		
		Throwable exception = assertThrows(Exception.class, () -> {
			f.pop();
		});
		assertEquals("Fifo is empty", exception.getMessage());
	}

}
