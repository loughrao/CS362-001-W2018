package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		 GregorianCalendar gregoriancalendar = new GregorianCalendar();
		 CalDay calday1 = new CalDay(gregoriancalendar);
		 CalDay calday2 = new CalDay();
		 Appt appt1 = new Appt(1,1,1,1,1, "Appointmento", "Descripto");
		 Appt appt2 = new Appt(2,2,2,2,2, "Two", "d2");
		 calday1.addAppt(appt1);
		 calday1.addAppt(appt2);
		 
		 assertEquals(2, calday1.getSizeAppts());
		 assertTrue(calday2.isValid());
		 assertTrue(calday1.isValid());
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 
	 }
//add more unit tests as you needed	
}
