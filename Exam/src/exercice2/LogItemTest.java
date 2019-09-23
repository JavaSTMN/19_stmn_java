package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LogItemTest {

	@Test
	void test() {
		LogItem dateTest = new LogItem(2019,8,23,10,5,"level","msg");
		assertEquals("2019/08/23 - 10:05 - level - msg", dateTest.format() );
	}

}
