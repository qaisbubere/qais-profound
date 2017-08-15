/****************************************************************************** 
 *  Purpose: Determines duplicate number among string of 100.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

import java.util.Scanner;

public class DuplicateNumber
{
		
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		
		
		int array[] = new int[100];
		System.out.println("Enter the no. of elements:");
		int mNumber = scanner.nextInt();

		System.out.println("Enter the elements of array:");
		for(int i=0;i<no;i++)
		{
			array[i] = scanner.nextInt(); 
		}
		
		
		for(int i=0;i<no;i++)
		{
			for(int j=i+1;j<no;j++)
			{	
				if(array[i] == array[j])
				{
				System.out.println(array[j]+ " is a duplicte no.");
				}
			}
		}	
		System.out.println(" no duplicate number");	
	}
}	
