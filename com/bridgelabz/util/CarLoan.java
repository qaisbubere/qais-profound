/****************************************************************************** 
 *  Purpose: Determines the monthly payment towards loan taken for car.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

 
import java.util.*;

public class CarLoan
{
	public static void main(String args[])
	{
		
	
	float P = Float.parseFloat(args[0]);
	float Y = Float.parseFloat(args[1]);
	float R = Float.parseFloat(args[2]);

        float n = 12 * Y;
	float r = R / (12*100);
	double x = Math.pow(1+r,(-n));
		
	
	double payment = (P*r) / (1-x);
	System.out.println("CarLoan is: " + payment);
	}
}
