package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class LogItemTest {

	@Test
	void testFormat() {
		@SuppressWarnings("deprecation")
		Date timestamp = new Date(2000, 12, 13, 1, 34);
		LogItem log = new LogItem(timestamp, "level", "message");
		String result = log.format();

		String expected = "00/12/13 - 01:34 - level - message";

		assertTrue(expected.equals(result), "Expected : '" + expected + "' got '" + result + "'");
	}

}
