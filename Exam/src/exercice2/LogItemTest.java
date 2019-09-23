package exercice2;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class LogItemTest {

	@Test
	void test() {
		
		LogItem log = new LogItem("info", "ceci est un test");
		Date time = new Date();
		
		String expected = time.getYear()+"/"+time.getMonth()+"/"+time.getDay()+"-"
							+time.getHours()+":"+time.getMinutes()+"-info-ceci est un test";
		
		assertEquals(expected, log.format());
	}

}
