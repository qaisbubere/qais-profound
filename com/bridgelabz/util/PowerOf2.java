/****************************************************************************** 
 *  Purpose: Find power of 2 for numbers.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

public class PowerOf2
{
	public static void main(String args[])
	{
	int n = Integer.parseInt(args[0]);
		
	int i= 0;
	int PowerOfTwo = 1;
		

	/*
	* prints power of 2 for numbers
	*/
	while (i <= n)
	{
		System.out.println(i+ " " +PowerOfTwo);
		PowerOfTwo = 2 * PowerOfTwo;
		i = i + 1;
		
	}
	}
}
