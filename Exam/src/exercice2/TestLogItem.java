package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class TestLogItem {

	@Test
	void testLog() {
		LogItem logItem = new LogItem("2", "Java test");
		String result = logItem.format();
		Date today = new Date();
		String todayMinutes = Integer.toString(today.getMinutes());
		String todayHours = Integer.toString(today.getHours());
		String todayDay = Integer.toString(today.getDay());
		String todayMonth = Integer.toString(today.getMonth());
		int todayYear = today.getYear() - 100;
		if (todayMinutes.length() < 2) {
			todayMinutes = '0' + todayMinutes;
		}
		if (todayHours.length() < 2) {
			todayHours = '0' + todayHours;
		}
		if (todayDay.length() < 2) {
			todayDay = '0' + todayDay;
		}
		if (todayMonth.length() < 2) {
			todayMonth = '0' + todayMonth;
		}
		String expected = todayYear + "/" + todayMonth + "/" + todayDay + "-" + todayHours + ":" + todayMinutes + " - 2 - Java test";
		assertEquals(expected, result);
	}
	
	@Test
	void testLogNotWorks() {
		LogItem logItem = new LogItem("2", "Java test");
		String result = logItem.format();
		assertNotEquals("14/06/17-08:34 - 1 - Mon message", result);
	}

}
