package exercice2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EventItem {
	SimpleDateFormat formattedDate;
	Date time;
	Object Source;
	String type;
	String newDate;
	
	public EventItem() {
		time = new Date(2000, 11, 21);
		formattedDate = new SimpleDateFormat("YY/MM/DD - hh:mm");
		newDate = formattedDate.format(time);
	}
	
	public String toString() {
		return newDate;
	}
	
}
