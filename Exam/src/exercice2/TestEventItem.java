package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class TestEventItem {

	@Test
	void testToString() {
		try {
			EventItem event = new EventItem();
			event.time = new Date(System.currentTimeMillis());
			event.type ="type1";
			String dateToString = event.toString();
			String expected="";
			assertEquals(expected, dateToString);
		} catch (Exception e) {
			fail("Test should not throw");
		}
	}

}
