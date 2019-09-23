package exercice2;

import java.util.Date;

public class EventItem {
	public static long time;
	public static Object source;
	public static String type;
	
	public static void main(String[] arg) {
		
	}
	
	/*public EventItem(Date time, Object source, String type) {
		this.time = time;
		this.source = source;
		this.type = type;
	}*/
	
	public static String toString(long time, Object source, String type) {
		String str = "";
		
		str = time + " - " + source + " - " + type;
		System.out.println(str);
		
		return str;
		
	}
}
