/****************************************************************************** 
 *  Purpose: Generate Sum of 2 Dice
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

/*
* Rolling 2 die and generating their sum.
*/
public class SumOfTwoDice {

    public static void main(String args[]) {


    // Number showing on the first die.    
    int die1;
    
    // Number showing on the second die.   
    int die2; 
    
    //For calculating Sum of Two die.        
    int rollSum;        
    
    //Roll the dice so they show some random values.
    //Random values between 1 and 6.
    //(int) to return perfect number
    die1 = (int)(Math.random()*6) + 1;
    die2 = (int)(Math.random()*6) + 1;

    //Displaying the values of Dice 
    System.out.println("Die 1 = "+die1);
    System.out.println("Die 2 = "+die2);
    
    //Calculating the sum of the die
    rollSum = die1+die2;

    //Displaying the Sum
    System.out.println("Sum of 2 dice = "+rollSum);
    }
}
