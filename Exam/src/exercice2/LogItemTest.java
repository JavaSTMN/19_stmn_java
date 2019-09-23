package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class LogItemTest {

	@SuppressWarnings("deprecation")
	@Test
	void TestFormatLogItem() {
		Date date = new Date();
		String expected =  String.format("%d/%d/%d-%d:%d - INFO - test", date.getYear() +1900, date.getMonth()+1, date.getDay(), date.getHours(), date.getMinutes());
		
		LogItem item = new LogItem(date, "INFO", "test");
		String actual = item.format();
		
		assertEquals(expected, actual);
	}

}
