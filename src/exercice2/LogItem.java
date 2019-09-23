package exercice2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogItem {

    private Date timestamp;
    private String level;
    private String message;

    public LogItem(Date timestamp, String level, String message) {
        this.timestamp = timestamp;
        this.level = level;
        this.message = message;
    }

    public String format(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yy/MM/dd-HH:mm");
        return dateFormat.format(timestamp) + " - " + level + " - " + message;
    }

}
