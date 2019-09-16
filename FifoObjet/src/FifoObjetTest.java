import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FifoObjetTest {

	@Test
	void testBase() {
		for(int i=0;i<=1000;i++)
		{
			FifoObjet.push(i);
		}
	}
	
}
