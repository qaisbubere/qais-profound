/******************************************************************************
 *  Purpose: prints five uniform random values between 0 and 1
 *  and calculate their average value, and their minimum and maximum value.
 
 *  @author Qais Bubere
 *  @version 1.0
 *  @since  10-08-2017
 *
 ******************************************************************************/


/*
 *Calculating average,minimum and maximum of randomly generated values
 */
import java.util.Random;

public class Stats5 {
      
    public static void main(String args[]) {
        
        //Declaring array for storing random values
        double[] number = new double[5];

        //Declaring sum to calculate the sum of generated 5 random values
        double sum = 0;

        //Generate and print 5 Numbers between 0 and 1
        for(int i=0;i<5;i++) {
           
           //Accepting and storing random values in array
           number[i] = Math.random();
        }

        //Printing the 5 random values stored in array and calculating the sum
        for(int i = 0; i<=4;i++) {
            System.out.println(number[i]);
            sum=sum+number[i];
        }
        
        //Displaying the Sum
        System.out.println("The Sum of 5 random value = "+sum);

        //Calculating the largest and smallest
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
