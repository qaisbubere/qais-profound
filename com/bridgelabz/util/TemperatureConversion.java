/****************************************************************************** 
 *  Purpose: Conversion of temperature from farenheit to celcius and vice versa.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/


import java.util.*;

public class TemperatureConversion
{
	public static void main(String args[])
	{

	double mTemperatureFarenheit = Double.parseDouble(args[0]);
	
	double mToCelcius = ((mTemperatureFarenheit - 32) / 1.8);
	double mToFarenheit = ((mToCelcius * 1.8) + 32);
	System.out.println("temperature in celcius is " + mToCelcius);
	System.out.println("temperature in farenheit is " +mToFarenheit);
	}
}
