package exercice2;
import java.util.Date;

public class EventItem {
	
	private Date time; 
	private Object source;
	private String type;
	
	public EventItem(Date time, Object source, String type) {
		this.time = time;
		this.source = source;
		this.type = type;
	}
	
	public String toString() {
		 return this.time.getYear() +"/" + this.time.getMonth() + "/" + this.time.getDay()+ "-" + this.time.getHours() + ":" + this.time.getMinutes() + "-"+
				this.source + "-"+
				this.type;
	}
	

}