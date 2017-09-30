/******************************************************************************
 *  Purpose:  Determines, the given date falls on which day of the week.
 * 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   28-09-2017
 *
 ******************************************************************************/
 
 import java.util.*;
 
 public class DayOfWeek1{
	 static int x , y0 , m0 , d0;
	 static String day;
	 public static String Calculation(int d, int m, int y)
	 {
	y0 = y - (14-m) / 12;
	x = y0 + y0 / 4-y0 / 100+y0 / 400;
	m0 = m + 12 * ((14-m)/12) -2;
	d0 =(d+x+(31*m0) / 12) % 7;
	
	switch(d0)
	{
		case 0:
		day = "Sunday";
		break;
			
		case 1:
		day = "Monday";
		break;
			
		case 2:
		day = "Tuesday";
		break;
			
		case 3:
		day = "Wednesday";
		break;
			
		case 4:
		day = "Thursday";
		break;
			
		case 5:
		day = "Friday";
		break;
			
		case 6:
		day = "Saturday";
		break;
	}
		return day;
	 }
	 
		public static void main(String args[])
	{
		int mDay = Integer.parseInt(args[0]);
		int mMonth   = Integer.parseInt(args[1]);
		int mYear  = Integer.parseInt(args[2]);
		
		DayOfWeek1 object = new DayOfWeek1();
		String Status = object.Calculation(mDay,mMonth,mYear);
		System.out.println("the day is "+Status);
	}
 }