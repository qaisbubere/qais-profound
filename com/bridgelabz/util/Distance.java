/****************************************************************************** 
 *  Purpose: Determines the distance between (x,y) to the origin (0,0).
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

public class Distance
{
	public static void main(String args[])
	{
		
	/*
	* two command line agruments provided by user
	*/		
	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);

	/*
	* calculation of distance
	*/
	double mDistance = Math.sqrt(x*x + y*y);
	double p = Math.pow(x,3);
	System.out.println(" distance from (" +x+ "," +y+ ") to (0,0) is  " + mDistance);
	System.out.println(" power of x = " +p);
	}
}