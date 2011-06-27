package org.icstars.calendar;

import java.util.Calendar;

import junit.framework.TestCase;

public class TestSchedule extends TestCase{

	public void testAddOneEventToSchedule() throws Exception{
		Schedule schedule = new Schedule();
		Event theEvent = new Event("foo", Calendar.getInstance(), Calendar.getInstance());
		schedule.scheduleEvent(theEvent);
		assertTrue(schedule.contains(theEvent));
	}
	
	public void testTwoEventsCanNotBeConcurrentlyScheduled() throws Exception{
		Schedule schedule = new Schedule();
		Calendar later = Calendar.getInstance();
		later.add(Calendar.HOUR_OF_DAY, 1);
		Event theEvent = new Event("foo", Calendar.getInstance(), later);
		schedule.scheduleEvent(theEvent);
		try{
			schedule.scheduleEvent(theEvent);
			fail();
		}catch(ConcurrentEventException badEvent){
			
		}
	}
}
