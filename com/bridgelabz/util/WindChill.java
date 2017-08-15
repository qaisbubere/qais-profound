/****************************************************************************** 
 *  Purpose: Determines the windchill in a temperature.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

 
import java.util.*;

public class WindChill
{
	public static void main(String args[])
	{
	double mPower, mWindChill;
	
	double Temperature = Double.parseDouble(args[0]);
	double velocity = Double.parseDouble(args[1]);
		
	mPower = Math.pow(velocity,0.16);
	mWindChill = 35.74 + 0.6215 * Temperature + (0.4275 * Temperature - 35.75 ) * mPower;
	System.out.println("windchill is"+ mWindChill);
	}
}