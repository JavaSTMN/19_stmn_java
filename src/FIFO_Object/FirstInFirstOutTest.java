package FIFO_Object;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstInFirstOutTest {
	static FirstInFirstOut fifo;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		fifo = new FirstInFirstOut();

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
		
		fifo.push(fifo, 24);
		
		assertEquals( 24, fifo.storage[fifo.size - 1]);
	}
	
	@Test
	void testNominalPop() throws Exception {
		
		assertEquals(34, fifo.pop(fifo));
	}

}
