package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class TestEventItem {

	@Test
	void testString() {
		String expected = "19/01/01 - file1 - info";
		String str = "";
		Date time = new Date(2019, 01, 01);
		Object source = "file1";
		String type = "info";

		str.toString(time, source, type);
		
		System.out.print(str);
	}

}
