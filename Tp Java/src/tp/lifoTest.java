package tp;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class lifoTest {
	
	lifo maLifo;
	lifo expectedFifo;
	lifo expectedLifoPop;

	@BeforeEach
	void setUp() throws Exception {
		maLifo = new lifo(6);
		expectedFifo = new lifo(6);
		expectedLifoPop = new lifo(3);
		for(int i = 0; i<6;i++) {
			expectedFifo.push(i);
		}
		for(int i = 0; i<3;i++) {
			expectedLifoPop.push(i);
		}
	}

	@AfterEach
	void tearDown() throws Exception {
		maLifo = null;
		expectedFifo = null;
	}
	@Test
	void pushOKtest() {
		for(int i = 0; i<6;i++) {
			maLifo.push(i);
		}
		assertArrayEquals(expectedFifo.getTab(),maLifo.getTab());
	}
	
	@Test
	void popOKtest() {
		for(int i = 0; i<6;i++) {
			maLifo.push(i);
		}
		for(int i = 0; i<3;i++) {
			maLifo.pop();
		}
		assertArrayEquals(expectedLifoPop.getTab(),maLifo.getTab());
	}
	

}
