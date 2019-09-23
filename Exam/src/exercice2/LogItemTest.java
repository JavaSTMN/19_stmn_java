package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Date;

class LogItemTest {

	@Test
	void testLogItem() throws Exception
	{
		LogItem li = new LogItem(new Date(), "MASTER", "Here is a simple message");
		
		String disp = li.format();
		
		System.out.println(disp);
	}

}
