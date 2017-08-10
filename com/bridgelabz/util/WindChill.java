/****************************************************************************** 
 *  Purpose: Determines the windchill in a temperature.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

 /*
 *import statements
 */
import java.util.*;

public class WindChill
{
	public static void main(String args[])
	{
	double mPower, mWindChill;
	
	
	/*
	*take temparature and velocity as command line argument
	*/
	double Temperature = Double.parseDouble(args[0]);
	double velocity = Double.parseDouble(args[1]);

	
	/*
	* formula to calculate wind chill
	*/		
	power = Math.pow(velocity,0.16);
	wind_chill = 35.74 + 0.6215 * Temperature + (0.4275 * Temperature - 35.75 ) * power;
	System.out.println("windchill is"+ wind_chill);
	}
}