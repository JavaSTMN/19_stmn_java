package exercice2;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

import org.junit.jupiter.api.Test;

class LogItemTest {

	@Test
	void test() {
		Date date = new Date();
		LogItem log = new LogItem(date,"Niveau 1","Accepte");
		System.out.print(log.format());
	}

}
