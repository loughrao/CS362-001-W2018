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
		 Appt appt2 = new Appt(1,1,1,1,1, "Appointmento", "Descripto");
		 Appt appt1 = new Appt(2,2,2,2,2, "Two", "d2");
		 calday1.addAppt(appt1);
		 calday1.addAppt(appt2);
		 calday1.iterator();

		 assertEquals(2, calday1.getSizeAppts());
		 assertTrue(calday2.isValid());
		 assertTrue(calday1.isValid());
		 assertEquals(0,calday2.getDay());
		 assertEquals(0,calday2.getYear());
		 assertEquals(0,calday2.getMonth());
		 assertEquals("\t --- 1/12/2018 --- \n" +
				 " --- -------- Appointments ------------ --- \n" +
				 "\t1/1/1 at 1:1am ,Appointmento, Descripto\n" +
				 " \t2/2/2 at 2:2am ,Two, d2\n \n",calday1.toString());
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 GregorianCalendar gc = new GregorianCalendar();
		 CalDay calday = new CalDay(gc);
		 Appt appt2 = new Appt(2,2,2,2,2,"2","2");
		 Appt appt1 = new Appt(1,2,2,2,2,"2","2");
		 calday.addAppt(appt1);
		 calday.addAppt(appt2);
		 assertEquals(appt1,calday.getAppts().get(0));
		 assertEquals(appt2,calday.getAppts().get(1));

	 }
	@Test
	public void test03()  throws Throwable  {
		GregorianCalendar gc = new GregorianCalendar();
		CalDay calday = new CalDay(gc);
		Appt appt1 = new Appt(2,2,2,2,2,"2","2");
		Appt appt2 = new Appt(1,2,2,2,2,"2","2");
		calday.addAppt(appt1);
		calday.addAppt(appt2);
		calday.addAppt(appt1);
		assertEquals(appt1,calday.getAppts().get(1));
		assertEquals(appt2,calday.getAppts().get(0));
		assertEquals(appt1,calday.getAppts().get(2));

	}
//add more unit tests as you needed
}
