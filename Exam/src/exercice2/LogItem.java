package exercice2;

import java.util.Date;

public class LogItem {
	private Date timestamp;
	private String level;
	private String message;
	
	public String format() {
		String logItem;
		timestamp = new Date();
		
		logItem = timestamp.getYear()+"/"
					+timestamp.getMonth()+"/"
					+timestamp.getDay()+"-"
					+timestamp.getHours()+":"
					+timestamp.getMinutes()+"-"
					+level+"-"
					+message;
		
		return logItem;	
	}
	
	public LogItem(String _level, String _message) {
		this.level = _level;
		this.message = _message;
	}
}
