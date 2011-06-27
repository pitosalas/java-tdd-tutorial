package org.icstars.calendar;

import java.util.Calendar;

import junit.framework.TestCase;

public class EventTest extends TestCase {
	Calendar earlier, now, later, latest;
	
	protected void setUp() throws Exception {
		earlier = Calendar.getInstance();
		now = Calendar.getInstance();
		later = Calendar.getInstance();
		latest = Calendar.getInstance();
		later.add(Calendar.HOUR_OF_DAY, 1);
		latest.add(Calendar.HOUR_OF_DAY, 2);
		earlier.add(Calendar.HOUR_OF_DAY, -1);
	}

	public void testAdjacentEventsDoNotOverlap(){
		Event firstEvent = new Event("first", now, later);
		Event secondEvent = new Event("second", later, latest);
		assertFalse(firstEvent.overlaps(secondEvent));
	}
	
	public void testSameEventsOverlap(){
		Event event = new Event("me", now, later);
		Event sameEvent = new Event("myself", now, later);
		assertTrue(event.overlaps(sameEvent));
	}

	public void testDistinctEventsDoNotOverlap(){
		Event event = new Event("first", earlier, now);
		Event laterEvent = new Event("last", later, latest);
		assertFalse(event.overlaps(laterEvent));
	}
	
	public void testPartialOverlappingEventsOverlap(){
		Event event = new Event("first", earlier, later);
		Event laterEvent = new Event("second", now, latest);
		assertTrue(event.overlaps(laterEvent));
	}
	
	public void testEventsWithSameStartButDifferentEndsOverlap(){
		Event event = new Event("one", now, later);
		Event concurrentEvent = new Event("two", now, latest);
		assertTrue(event.overlaps(concurrentEvent));
	}
	
	public void testWeirdCaseOfEventsThatHaveNoDuration(){
		Event weirdEvent = new Event("one", now, now);
		Event otherWeirdEvent = new Event("two", now, now);
		assertFalse(weirdEvent.overlaps(otherWeirdEvent));
	}
}
