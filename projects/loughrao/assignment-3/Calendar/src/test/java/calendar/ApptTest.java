package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 // Tests set methods
	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new appointment using only set methods
		 Appt appt = new Appt(1,1,1,1,1,"title","description");
		 appt.setStartHour(startHour);
		 appt.setStartMinute(startMinute);
		 appt.setStartDay(startDay);
		 appt.setStartMonth(startMonth);
		 appt.setStartYear(startYear);
		 appt.setTitle(title);
		 appt.setDescription(description); 
		 
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 // Tests Nulls for set methods and the compareTo method, and the get functions for recurrence	
	 @Test
	  public void test03()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new appointment using only set methods
		 Appt appt = new Appt(1,1,1,1,1,"title","description");
		 appt.setStartHour(startHour);
		 appt.setStartMinute(startMinute);
		 appt.setStartDay(startDay);
		 appt.setStartMonth(startMonth);
		 appt.setStartYear(startYear);
		 appt.setTitle(null);
		 appt.setDescription(null);
		 appt.setRecurrence(null, 1, 1, 1);
		 Appt comp = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);	
		 assertEquals(1,appt.getRecurNumber());
		 assertEquals(1,appt.getRecurIncrement());
		 assertEquals(1,appt.getRecurBy());
		 assertEquals(0,appt.getRecurDays().length);
		 assertTrue(appt.isRecurring());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription()); 
		 assertEquals(0,comp.compareTo(appt));
		 
	 }
	 // Tests toString	
	 @Test
	  public void test04()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertEquals(appt.toString(),appt.toString());
		 appt.setStartHour(13);
		 assertEquals(appt.toString(),appt.toString());
		 appt.setStartHour(0);
		 assertEquals(appt.toString(),appt.toString());
	 }
	 @Test
	 public void test05() throws Throwable {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);
		 int startHour2=2;
		 int startMinute2=3;
		 int startDay2=1;
		 int startMonth2=05;
		 int startYear2=2020;
		 String title2="Birthday Party";
		 String description2="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt2 = new Appt(startHour2,
				 startMinute2 ,
				 startDay2 ,
				 startMonth2 ,
				 startYear2 ,
				 title2,
				 description2);
		 assertEquals(54,appt.compareTo(appt2));
	 }
	
}
