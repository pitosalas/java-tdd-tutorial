package org.icstars.calendar;

import java.util.Calendar;

/** Describe a single Event on the calendar
 * 
 * @author pitosalas
 *
 */
public class Event {

	private String description;
	private Calendar start;
	private Calendar end;
	
	public Event(String description, Calendar start, Calendar end) {
		this.description = description;
		this.start = start;
		this.end = end;
	}

	public boolean overlaps(Event other) {
		return this.start.before(other.end) && this.end.after(other.start);
	}

}
