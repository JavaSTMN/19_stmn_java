import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTest {

	@Test
	void test() {
		try {
			 double res = Moy.moy(new double[] {1,2});
			 double expected = 1.6;
			 assertEquals(expected, res);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");	      
		    }
	}
}
