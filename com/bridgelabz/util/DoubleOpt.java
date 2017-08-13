/****************************************************************************** 
 *  Purpose: performs various operations on same three inputs.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

class DoubleOpt 
{
     public static void main(String[] args) 
	 
	{
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
 

	/*
	* three operation 
	*/
        double result1 = (a + b * c);
        double result2 = (a * b + c);
        double result3 = (a % b + c); 

		System.out.println("result of " +a+ " + " +b+ " * " +c+ " = " +result1);

		System.out.println("result of " +a+ " * " +b+ " + " +c+ " = " +result2);
   
		System.out.println("result of " +a+ " % " +b+ " + " +c+ " = " +result3);     
  
    }
  }
