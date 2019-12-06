package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class VectorTest {

	@Test
	void testNorm()
	{
		double expected = Math.sqrt(Math.pow(1, 2) + Math.pow(1, 2));
		Vector v = new Vector(1, 1);
		assertEquals(expected, v.norm());
	}

	@Test
	void testScale()
	{
		Vector expected = new Vector(2, 2);
		Vector v = new Vector(1, 1);
		assertEquals(expected.Vx, v.scale(2).Vx);
		assertEquals(expected.Vy, v.scale(2).Vy);
	}
	
	@Test
	void testNormalize()
	{
		double expected = 1/(Math.sqrt(Math.pow(1, 2) + Math.pow(1, 2)));
		Vector v = new Vector(1, 1);
		assertEquals(expected, v.normalize().Vx);
		assertEquals(expected, v.normalize().Vy);
	}
	
	@Test
	void testAdd()
	{
		double expected = 3;
		Vector v = new Vector(1, 1);
		Vector w = new Vector(2, 2);
		Vector x = v.add(w);
		assertEquals(expected, x.Vx);
		assertEquals(expected, x.Vy);
	}
}
