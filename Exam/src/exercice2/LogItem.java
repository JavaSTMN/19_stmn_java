package exercice2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogItem
{
	//attributes
	Date timestamp;
	String level;
	String message;
	
	
	//constructor
	LogItem(Date  _timestamp, String _level, String _message)
	{
		timestamp = _timestamp;
		level = _level;
		message = _message;
	}
	
	//format
	String format()
	{
		String res = "";
		
		SimpleDateFormat df = new SimpleDateFormat("yy/MM/dd-hh:mm");
		
		res += df.format(timestamp) + " - " + level + " - " + message;
		
		return res;
	}
}
