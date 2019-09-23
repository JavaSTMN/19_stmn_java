package exercice2;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogItemTest {

    @Test
    public void logItemTest() throws ParseException {
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yy/MM/dd-HH:mm");

        LogItem logItem = new LogItem(date, "1", "This is a message.");

        assertEquals(dateFormat.format(date) + " - 1 - This is a message.", logItem.format());
    }

}
