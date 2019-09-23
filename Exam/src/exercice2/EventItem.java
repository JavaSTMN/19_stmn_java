package exercice2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EventItem {
	
	Calendar time;
	Object source;
	String type;
	
	/**
	 * Format a date to put a zero before if the number is less than 10
	 * @param number to format
	 * @return the formatted number
	 */
	public String format(int number) {
		String formatted = "";
		if(number < 10) {
			formatted = "0" + number;
			return formatted;
		}
		return "" + number;
		
	}
	/**
	 * toString
	 * @return the date, type and source
	 */
	public String toString() {
		Date date = new Date();
		time = new GregorianCalendar();
		time.setTime(date);
		
		
		String day = time.get(Calendar.YEAR)+ "/" + format((time.get(Calendar.MONTH) + 1)) + "/" + format(time.get(Calendar.DAY_OF_MONTH));
		String hour = format(time.get(Calendar.HOUR)) + ":" + format(time.get(Calendar.MINUTE));
		
		int index = source.toString().indexOf("@");
		source = source.toString().substring(0,index);
		
		return day + " - " + hour + " - " + type + " - " + source;
		
	}

}
