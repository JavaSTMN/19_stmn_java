package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EventItemTest {
	EventItem item = new EventItem();
	
	@Test
	void test() {
		assertEquals("1991", item.toString());
	}

}
