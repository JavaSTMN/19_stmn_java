package exercice2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EventItem {
	Date time;
	Object source;
	String type;
	
	EventItem(Object s, String t){
		this.time = new Date();
		this.source =s;
		this.type = t;
	}
	public String toString(){
		String formated = "";
		SimpleDateFormat dateFormat = new SimpleDateFormat("YY/MM/dd-HH:mm");
		formated = dateFormat.format(this.time) +"-"+type;
		return formated;
	}
}
