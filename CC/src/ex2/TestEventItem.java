package ex2;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;
import ex1.Calculs;

class TestEventItem {

	@SuppressWarnings("deprecation")
	@Test
	void testToString() {
		String result = "";
		Date time;
		time.setDate(120);
		time.setMonth(1);
		time.setDate(9);
		Object source = new int [1];
		String type = "This is a type of event";
		try {
			result = EventItem.toString();
		} catch (Exception e) {
			fail("ToString exception");
		}
		String expected = "20/01/09-00:00-This is a type of event";
		assertEquals (result, expected);
	}

}
