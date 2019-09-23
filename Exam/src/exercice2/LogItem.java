package exercice2;

import java.util.Date;

public class LogItem {
	public Date timestamp;
	public String level;
	public String message;

	public LogItem(Date timestamp, String level, String message) {
		this.timestamp = timestamp;
		this.level = level;
		this.message = message;
	}

	/**
	 * Retourne une chaine de caractere au format YY/MM/DD - HH:MM - level - message
	 * 
	 * @return String
	 */
	public String format() {
		System.out.println(this.timestamp);
		return (this.timestamp.getYear()-1) + "/" + (this.timestamp.getMonth()+1) + "/" + this.timestamp.getDate() + " - "
				+ this.timestamp.getHours() + ":" + this.timestamp.getMinutes() + " - " + this.level + " - "
				+ this.message;
	}

}
