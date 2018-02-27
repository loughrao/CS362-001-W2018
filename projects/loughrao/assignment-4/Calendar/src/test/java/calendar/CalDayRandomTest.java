package calendar;


import org.junit.Test;


import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	 public void randomtest()  throws Throwable  {
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


		 System.out.println("Start testing...");

		 try{
			 GregorianCalendar gregoriancalendar = new GregorianCalendar();
			 CalDay calday = new CalDay(gregoriancalendar);
			 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				 long randomseed =System.currentTimeMillis(); //10
				 //			System.out.println(" Seed:"+randomseed );
				 Random random = new Random(randomseed);
				 int startHour=ValuesGenerator.RandInt(random);
				 int startMinute=ValuesGenerator.RandInt(random);
				 int startDay=ValuesGenerator.RandInt(random);;
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.RandInt(random);
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
				 for (int i = 0; i < NUM_TESTS; i++) {
					 String methodName = ApptRandomTest.RandomSelectMethod(random);
					 if (methodName.equals("setTitle")){
						 String newTitle=(String) ValuesGenerator.getString(random);
						 appt.setTitle(newTitle);
					 }
					 else if (methodName.equals("setRecurrence")){
						 int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
						 int[] recurDays=ValuesGenerator.generateRandomArray(random, sizeArray);
						 int recur=ApptRandomTest.RandomSelectRecur(random);
						 int recurIncrement = ValuesGenerator.RandInt(random);
						 int recurNumber=ApptRandomTest.RandomSelectRecurForEverNever(random);
						 appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
					 }
					 calday.addAppt(appt);
				 }
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				 if((iteration%10000)==0 && iteration!=0 )
					 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 }
		 }catch(NullPointerException e){

		 }

		 System.out.println("Done testing...");

	 }



}
