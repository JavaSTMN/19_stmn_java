package exercice2;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class EventItemTest {

	@Test
	void testString() throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("FF/yy/MM : HH/mm");
		EventItem Item = new EventItem(formatter.parse("05/98/10 : 17/53"), "UneSource", "Message");
		assertEquals("98/10/29 -17:53-UneSource-Message", Item.toString());
		
		//probleme léger vis-à-vis de la date, cela devrait récuperer le mois et le jour normalement mais problème
	}

}
