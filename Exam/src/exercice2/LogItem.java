package exercice2;

import java.util.Date;

public class LogItem {
	
	public Date timestamp;
	public String level;
	public String message;
	
	public LogItem(String level, String message) {
		this.timestamp = new Date();
		this.level = level;
		this.message = message;
	}
	
	@SuppressWarnings("deprecation")
	public String format() {
		String day = Integer.toString(this.timestamp.getDay());
		if (day.length() < 2) {
			day = '0' + day;
		}
		String month = Integer.toString(this.timestamp.getMonth());
		if (month.length() < 2) {
			month = '0' + month;
		}
		int year =  this.timestamp.getYear() - 100;
		String hours = Integer.toString(this.timestamp.getHours());
		if (hours.length() < 2) {
			hours = '0' + hours;
		}
		String minutes = Integer.toString(this.timestamp.getMinutes());
		if (minutes.length() < 2) {
			minutes = '0' + minutes;
		}
		return year + "/" + month + "/" + day + "-" + hours + ":" + minutes + " - " + this.level + " - " + this.message;
	}
}
