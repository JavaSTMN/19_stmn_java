package ex2;

import java.util.Date;

public class EventItem {
	static Date time;
	static Object source;
	static String type;
	public static String toString () {
		String output = time.toString() + source.toString() + type;
		return output;
	}
}
