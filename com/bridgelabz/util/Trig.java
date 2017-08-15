/****************************************************************************** 
 *  Purpose: converts the given degree into radians and then perform various trignometric operations.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
class Trig
{
 	public static void main(String args[])
	{

  	double degree = Double.parseDouble(args[0]);
  	double radians = Math.toRadians(degree);

	
  	double sin = Math.sin(radians);
   	System.out.println("sin("+degree+") = " +sin);

   
   	double cos = Math.cos(radians);
   	System.out.println("cos("+degree+") = " +cos);

   
  	double tan = Math.tan(radians);
   	System.out.println("tan("+degree+") = " +tan);

   
  	double r = sin*sin + cos*cos;
   	System.out.println(sin*sin+ "  +  " +cos*cos+ " =  " +r);
  	}
 }
