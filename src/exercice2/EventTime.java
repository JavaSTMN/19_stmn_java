package exercice2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EventTime {
	
	Date time;
	Object source;
	String type;

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.print(formatter.format(date));
	}
	public EventTime(Date time_, Object source_, String type_) {
		this.time = time_;
		this.source = source_;
		this.type = type_;
	}
	
	@SuppressWarnings("deprecation")
	public String toString() {
		
		String myString = "";
		myString += time.getYear() + "/" + time.getMonth() + "/" + time.getDay() + " - ";
		myString += time.getHours() + ":" + time.getMinutes() + " - ";
		myString += source + " - " + type;
		System.out.println(myString);
		return myString;
	}
}
