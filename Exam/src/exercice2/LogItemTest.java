package exercice2;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

class LogItemTest {

	@Test
	public void testFomat() throws Exception {
		LogItem item = new LogItem("level", "Hello");
		String expected = "23/9/2019-9:46-level-Hello.";
		String actual = item.format();
		System.out.println(actual);
		assertEquals(expected, actual);
	}

}
