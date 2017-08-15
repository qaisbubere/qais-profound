/******************************************************************************
 *  Purpose: Find out the factors for number
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
 

public class PrimeFactor
{
	public static void main(String args[])
	{
		
		int Number = Integer.parseInt(args[0]);
		System.out.println("Following are the factors of "+ Number);

		
		for(int i=1; i*i <= Number ;i++)
		{
			if(Number % i == 0)
			{
				System.out.println(i);
			}
		}
	}
}
