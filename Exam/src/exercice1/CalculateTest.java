package exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateTest
{

	@Test
	void TestSquSum() throws Exception
	{
		int test = Calculate.squSum(10);
		
		assertEquals(385, test);
	}
	
	@Test
	void TestSumSqu() throws Exception
	{
		int test = Calculate.sumSqu(10);
		
		assertEquals(3025, test);
	}
	
	//différence entre la somme des carrés des 100 premiers entiers naturels et le carré de la somme
	@Test
	void difference() throws Exception
	{
		int test = Calculate.sumSqu(100) - Calculate.squSum(100);
		
		System.out.println(test);
		//res = 25164150
	}

}
