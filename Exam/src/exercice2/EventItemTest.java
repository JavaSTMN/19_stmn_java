package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

class EventItemTest {

	@Test
	void test() {
		Date date = new Date();
		Calendar time = new GregorianCalendar();
		time.setTime(date);

		String today = "2019/09/23";
		String hour = time.get(Calendar.HOUR) + ":" + time.get(Calendar.MINUTE);
		
		EventItem item = new EventItem();
		item.type = "test";
		item.source = new Object();
		
		String toTest = today + " - " + hour + " - test - java.lang.Object";
		
		assertEquals(item.toString(), toTest);
		
	}

}
