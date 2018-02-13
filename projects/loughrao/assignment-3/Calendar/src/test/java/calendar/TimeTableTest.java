package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
	 	TimeTable tt = new TimeTable();
	 	GregorianCalendar fd = new GregorianCalendar(1997,2,8);
	 	GregorianCalendar ld = new GregorianCalendar(1997,4,16);
	 	LinkedList<Appt> appts = new LinkedList<Appt>();
	 	appts.add(new Appt(8,34,10,3,1997,"day1","desc"));
	 	appts.add(new Appt(8,34,10,4,1997,"day1","desc"));
		appts.get(0).setRecurrence(new int[]{1,2,3,4,5,6,7},1,1,8);
	 	assertNotEquals(null, tt.getApptRange(appts,fd,ld));
	 	assertEquals(null,tt.deleteAppt(appts,null));
	 	assertEquals(null, tt.deleteAppt(null,appts.get(0)));



		 appts.get(0).setStartMonth(5);
	 	assertEquals(null,tt.deleteAppt(appts, appts.get(0)));

	 	tt.permute(appts,new int[]{0,1});
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 TimeTable tt = new TimeTable();
		 GregorianCalendar fd = new GregorianCalendar(1997,2,8);
		 GregorianCalendar ld = new GregorianCalendar(1997,2,9);
		 LinkedList<Appt> appts = new LinkedList<Appt>();
		 appts.add(new Appt(8,34,8,2,1997,"day1","desc"));
		 assertEquals(appts.get(0).toString(),tt.getApptRange(appts,fd,ld).get(0).getAppts().get(0).toString());
	 }
//add more unit tests as you needed
}
