package FIFO_Object;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import matrices.matrice;

class FirstInFirstOutTest {
	static FirstInFirstOut fifo;
	static FirstInFirstOut fifoMax;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// Setup for the FIFO without using the untested functions
		fifoMax = new FirstInFirstOut();
		fifo = new FirstInFirstOut();
		fifo.storage[0] = 34;
		fifo.size++;	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		fifo = null;
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNominalPush() throws Exception {
		
		fifo.push(24);
		
		assertEquals( 24, fifo.storage[fifo.size - 1]);
	}
	
	@Test
	void testNominalPop() throws Exception {
		
		assertEquals(34, fifo.pop());
	}
	
	@Test
	void testSizeMaxException() throws Exception {
		fifoMax.size = fifoMax.storage.length;
		
		assertThrows(Exception.class, () -> {fifoMax.push(10);;});
	}

}
