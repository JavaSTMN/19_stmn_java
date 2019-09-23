package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EventItemTest {

	@Test
	void toStringTest() {
		EventItem test = new EventItem(new Object(), "fete");
		String formated = test.toString();
		System.out.println(formated);
	}

}
