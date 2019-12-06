package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {
	@Test
	void test_norm_normal() {
		double v0 = 1.0;
		double v1 = 1.0;

		double expected = Math.sqrt(2);

		double res = Vector.norm(v0, v1);

		assertEquals(expected, res, "");

	}

	@Test
	void test_norm_negatifs() {
		double v0 = 1.0;
		double v1 = -1.0;

		double expected1negatif = Math.sqrt(2.0);
		double expected2negatif = Math.sqrt(2.0);

		double res1negatif = Vector.norm(v0, v1);
		double res2negatif = Vector.norm(v1, v1);

		assertEquals(expected1negatif, res1negatif, "");
		assertEquals(expected2negatif, res2negatif, "");
	}

	@Test
	void test_norm_zeroes() {
		double v0 = 0.0;
		double v1 = 1.0;
		double v2 = -1.0;

		double expected1zeropositif = Math.sqrt(1.0);
		double expected1zeronegatif = Math.sqrt(1.0);
		double expected2zero = 0.0;

		double res1zeropositif = Vector.norm(v0, v1);
		double res1zeronegatif = Vector.norm(v0, v2);
		double res2zero = Vector.norm(v0, v0);

		assertEquals(expected1zeropositif, res1zeropositif, "");
		assertEquals(expected1zeronegatif, res1zeronegatif, "");
		assertEquals(expected2zero, res2zero, "");
	}

}
