package exercice2;

import java.util.Date;

public class LogItem {
	public static Date timestamp;
	public static String level;
	public static String message;
	
	LogItem(String level, String message) {
		this.level = level;
		this.message = message;
	}
	
	public static String format() {
		String msg = "";
		msg += timestamp.getDay()+"/";
		msg += timestamp.getMonth()+"/";
		msg += timestamp.getYear()+"-";
		msg += timestamp.getHours()+":";
		msg += timestamp.getMinutes()+"-";
		msg += level+"-";
		msg += message+".";
		return msg;
	}
}
