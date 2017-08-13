/****************************************************************************** 
 *  Purpose: Conversion of temperature from farenheit to celcius and vice versa.
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

public class TemperatureConversion
{
	public static void main(String args[])
	{
	double mTemperatureConverted;
	
	/*
	* accept temperature in farenheit from user
	*/
	System.out.println("enter temperature in farenheit");
	double mTemperatureFarenheit = Double.parseDouble(args[0]);
	
	/*
	* formula for temperature conversion from farenheit to celcius
	*/ 
	mTemperatureConverted = ((mTemperatureFarenheit - 32) / 1.8);
	System.out.println("temperature in celcius is " + mTemperatureConverted);
	}
}
