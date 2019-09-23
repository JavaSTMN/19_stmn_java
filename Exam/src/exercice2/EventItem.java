package exercice2;

import java.util.Date;

public class EventItem {
	Date time;
	String info;
	String message;
	
	public String toString() {
		String Message = "";
		
		int year = time.getYear();
		int month = time.getMonth();
		int dat = time.getDay();
		int hour = time.getHours();
		int min = time.getMinutes();
		
		
		
		return Message;
	}	
}
