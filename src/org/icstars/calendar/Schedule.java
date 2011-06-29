package org.icstars.calendar;

import java.util.ArrayList;

/**
 * Schedule contains and operates on a series of events
 * @author pitosalas
 *
 */
public class Schedule {
	ArrayList<Event> events = new ArrayList<Event>();
	
	public void scheduleEvent(Event event) throws ConcurrentEventException{
		for (Event existingEvent : events) {
			if (existingEvent.overlaps(event))
				throw new ConcurrentEventException();
		}
		events.add(event);
	}

	public boolean contains(Event theEvent) {
		return events.contains(theEvent);
	}

}
