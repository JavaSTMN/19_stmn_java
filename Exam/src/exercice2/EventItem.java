package exercice2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class EventItem {
	
	private Date time;
	
	private Object source;
	
	private String type;
	
	public EventItem(Date time, Object source, String type) {
		this.time = time;
		this.source = source; 
		this.type = type;
	}
	
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("yy/MM/dd-hh:mm", Locale.FRENCH);  
		String formattedDate = formatter.format(time);
		return formattedDate + "-" + source.toString() + "-" + type;
	}
	
}
