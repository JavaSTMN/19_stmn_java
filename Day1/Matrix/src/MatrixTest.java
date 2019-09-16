import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatrixTest {

	@Test
	void testEmpty() {
		int[][] a = {};
		int[][] b = {};
		Throwable exception = assertThrows(Exception.class, () -> {Matrix.multiply(a, b);});
		assertEquals("Invalid array sizes", exception.getMessage());
	}

	@Test
	void testInvalidSize() {
		int[][] a = {{1,2}};
		int[][] b = {{2,3}};
		Throwable exception = assertThrows(Exception.class, () -> {Matrix.multiply(a, b);});
		assertEquals("Invalid array sizes", exception.getMessage());
	}

	@Test
	void testVector() {
		int[][] a = {{1}, {2}, {3}};
		int[][] b = {{1,0,2}};
		int[][] c = {};
		try {
			c = Matrix.multiply(a, b);
		} catch (Exception e) {
			fail("Should not throw");
		}
		int[][] expected = {
				{1,0,2},
				{2,0,4},
				{3,0,6}
		};

		assertArrayEquals(expected, c);
	}
	
	@Test
	void testNominal() {
		int[][] a = {
				{1,2},
				{3,4},
				{5,6}
		};
		int[][] b = {
				{1,0},
				{0,2}
		};
		int[][] c = {};
		try {
			c = Matrix.multiply(a, b);
		} catch (Exception e) {
			fail("Should not throw");
		}
		int[][] expected = {
				{1,4},
				{3,8},
				{5,12}
		};
		assertArrayEquals(expected, c);
	}
}
