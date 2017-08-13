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
		
	public static void main(String[]args)
	{
		Scanner s = new Scanner (System.in);
		
		//define array for storing the nos
		int a[]=new int[100];
		System.out.println("Enter the no. of elements:");
		int no=s.nextInt();
		System.out.println("Enter the elements of array:");
		

		//store the elements of array
		for(int i=0;i<no;i++)
		{
			a[i]=s.nextInt(); 
		}
		
		//compare and checking of duplicate number
		for(int i=0;i<no;i++)
		{
			for(int j=i+1;j<no;j++)
			{	
				if(a[i]==a[j])
				{
					System.out.println(a[j]+ " is a duplicte no.");
				}
			}
		}	
		System.out.println(" no duplicate number");	
	}
}	
