package exercice2;

import java.util.Date;

public class LogItem {
	private Date timestamp;
	private String level;
	private String message;
	
	public LogItem(String level, String message) {
		this.timestamp = new Date();
		this.level = level;
		this.message = message;
	}
	
	public LogItem(Date date, String level, String message) {
		this.timestamp = date;
		this.level = level;
		this.message = message;
	}
	
	@SuppressWarnings("deprecation")
	public String format() {
		int year, month, day;
		int hours, minutes;
		
		year = timestamp.getYear() + 1900;
		month = timestamp.getMonth() + 1;
		day = timestamp.getDay();
		
		hours = timestamp.getHours();
		minutes = timestamp.getMinutes();
		
		return String.format("%d/%d/%d-%d:%d - %s - %s", year, month, day, hours, minutes, level, message);
	}
}
