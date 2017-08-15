/****************************************************************************** 
 *  Purpose: Flip a coin and find possibilities of heads and tails.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

import java.util.Scanner;

public class FlipCoin
{
	public static void main(String[] args)
	{
		
	Scanner scanner = new Scanner(System.in);
	float NumberOfFlips = 0, headcounter = 0;
	float tailcounter=0;
		
	System.out.println("Press 1 if you want to flip the coin ");
	int Flip = scanner.nextInt();
		
	while(Flip == 1)
	{
		if(Math.random()<0.5) 
		{
		headcounter++;
		System.out.println("Heads");
		}
		else
		{
		tailcounter++;
		System.out.println("Tails");
		}

		NumberOfFlips++;
        	System.out.println("Do you want to flip the coin again then press 1 otherwise press any other number than 1 ");	
		Flip = scanner.nextInt();
	}
	
	float PercentageOfHead = (headcounter/NumberOfFlips)*100;
	System.out.println("percentage of head is "+PercentageOfHead);
	float PercentageOfTail = (100 - PercentageOfHead);
	//(tailcounter/NumberOfFlips)*100;
	System.out.println("percentage of tail is "+PercentageOfTail);
		
  	}
}