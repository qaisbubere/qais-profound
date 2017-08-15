/******************************************************************************
 *  Purpose: Prints out Numberin binary.
 * 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

public class Binary 
{ 
    public static void main(String[] args) 
	{ 

	int Number = Integer.parseInt(args[0]);
	int power = 1;

	while (power <= Number/2) 
	{
	power *= 2;
        }
  
        
        while (power > 0) 
	{
        	if (Number < power) 
		{
       		System.out.print(0);
        	}

        	else 
		{
        	System.out.print(1);
        	Number -= power;
        	}
        	power /= 2;
        }

        System.out.println();

	}

}
		
