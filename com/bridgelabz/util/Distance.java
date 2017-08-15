/****************************************************************************** 
 *  Purpose: Determines the distance between (x,y) to the origin (0,0).
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/


import java.util.*; 

public class Distance
{
	public static void main(String args[])
	{
		
			
	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);

	
	double mDistance = Math.sqrt(x*x + y*y);
	double mPower = Math.pow(x,3);
	System.out.println(" distance from (" +x+ "," +y+ ") to (0,0) is  " + mDistance);
	System.out.println(" power of x = " +mPower);
	}
}