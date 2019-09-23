package exercice2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercice1.Calculator;

class EventItemTest {	

	@Test
	void eventItemToStringTest() throws Exception {
		// init
		SimpleDateFormat formatter = new SimpleDateFormat("yy/MM/dd-hh:mm", Locale.FRENCH);  
		EventItem event = new EventItem(formatter.parse("20/10/26-08:30"), this, "testEvent");
		String goodFormat = "20/10/26-08:30-" + this.toString() + "-testEvent";
		
		// exec
		String testValue = event.toString();
		
		// assert
		assertEquals(goodFormat, testValue);
	}
}
