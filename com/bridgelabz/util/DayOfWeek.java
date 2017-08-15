/****************************************************************************** 
 *  Purpose: Determines, the given date falls on which day of the week.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/


import java.util.*;

public class DayOfWeek
{
	public static void main(String args[])
	{
	int x , y1 , m1 , d1;
		
			
	int mMonth = Integer.parseInt(args[0]);
	int mDay   = Integer.parseInt(args[1]);
	int mYear  = Integer.parseInt(args[2]);
		
		
	
	y1 = mYear - (14 - mMonth) / 12;
	x  = y1 + y1 / 4 - y1 / 100 + y1 / 400;
	m1 = mMonth + 12 * ((14 - mMonth) / 12) - 2;
	d1 = (mDay + x + (31*m1) / 12) % 7;
		

	switch(d1)
	{
		case 0:
		System.out.println("Day of the week is Sunday " );
		break;
			
		case 1:
		System.out.println("Day of the week is Monday " );
		break;
			
		case 2:
		System.out.println("Day of the week is Tuesday " );
		break;
			
		case 3:
		System.out.println("Day of the week is Wednesday" );
		break;
			
		case 4:
		System.out.println("Day of the week is Thursday " );
		break;
			
		case 5:
		System.out.println("Day of the week is Friday " );
		break;
			
		case 6:
		System.out.println("Day of the week is Saturday " );
		break;
	}

			      
	}
}	
		
		