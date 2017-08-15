
/****************************************************************************** 
 *  Purpose: to produce random sequence of numbers.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
public class RandomSeq 
{

	public static void main(String args[])
  	{

    	int inputNumber = Integer.parseInt(args[0]);

      	for(int i=0; i<100; i++)  
        {
        System.out.println(Math.random());             
	}

  	}
}
