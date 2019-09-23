package exercice2;

import java.util.Date;

public class LogItem {
	Date timestamp;
	String level;
	String message;
	
	public LogItem(int year, int month, int day, int hours, int min,String level, String message) {
		this.timestamp = new Date();
		this.timestamp.setYear(year);
		this.timestamp.setMonth(month);
		this.timestamp.setDate(day);
		this.timestamp.setHours(hours);
		this.timestamp.setMinutes(min);

		this.level = level;
		this.message = message;
		
	}
	
	public String format() {
		Date current = new Date();

		String formated = "";
		int year = this.timestamp.getYear()+1900;
		
		if(year > current.getYear()) {
			year -= 1900;
		}
		
		int month = this.timestamp.getMonth();
		String monthStr = "" + month;
		if(month < 10)  {
			monthStr = "0" + monthStr;
		}
		
		int day = this.timestamp.getDate();		
		String dayStr = "" + day;
		if(day < 10)  {
			dayStr = "0" + dayStr;
		}
		
		int hours = this.timestamp.getHours();		
		String hoursStr = "" + hours;
		if(hours < 10)  {
			hoursStr = "0" + hoursStr;
		}
		
		int min = this.timestamp.getMinutes();		
		String minStr = "" + min;
		if(min < 10)  {
			minStr = "0" + minStr;
		}
		
		formated += year +"/"+ monthStr +"/"+ dayStr + " - " + hoursStr + ":" + minStr + " - "+  this.level + " - " + this.message;
		return formated;
	}

}
