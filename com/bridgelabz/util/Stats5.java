/******************************************************************************
 *  Purpose: prints five uniform random values between 0 and 1
 *  and calculate their average value, and their minimum and maximum value.
 
 *  @author Qais Bubere
 *  @version 1.0
 *  @since  10-08-2017
 *
 ******************************************************************************/
import java.util.Random;

public class Stats5 
{
      
    	public static void main(String args[]) 
	{
       
        double[] number = new double[5];
        double sum = 0;

      
        for(int i=0;i<5;i++) 
	{           
        number[i] = Math.random();
        }

        
        for(int i = 0; i<=4;i++) 
	{
        System.out.println(number[i]);
        sum = sum+number[i];
        }
        
        
        System.out.println("The Sum of 5 random value = " +sum);
        double largest = Math.max(number[0],Math.max(number[1],Math.max(number[2],Math.max(number[3],number[4]))));
        double smallest =Math.min(number[0],Math.min(number[1],Math.min(number[2],Math.min(number[3],number[4])))); 

        //for (int i = 1; i < 4; i++) {

          //if(number[i] > largest)
            //largest = number[i];

          //else if(number[i] < smallest)
            //smallest = number[i];
        System.out.println("Minimum of the 5 generated values = "+smallest);
        System.out.println("Maximum of the 5 generated values = "+largest);
    }
}
