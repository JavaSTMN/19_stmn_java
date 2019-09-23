package exercice2;

import java.text.DateFormat;
import java.util.Date;


public class LogItem {
	
	private Date timestamp;
	private String level;
	private String message;
	
	public LogItem(Date time,String lvl, String msg) {
		timestamp=time;
		level=lvl;
		message=msg;
	}
	
	public String format() {
		String date;
		DateFormat shortDateFormat = DateFormat.getDateTimeInstance(
		        DateFormat.SHORT,
		        DateFormat.SHORT);
		date=shortDateFormat.format(timestamp);
		return (date+"-"+level+"-"+message);
	}
}
