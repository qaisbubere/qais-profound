/******************************************************************************
 *  Purpose: Taking range of number as input and outputs the Prime Numbers 
 *  in that range.
 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since  10-08-2017
 *
 ******************************************************************************/

/*
*range of number as input and outputs the Prime Numbers in that range
*/

public class PrimeNumberInRange {

	public static void main(String args[]) {
        
        //Accepting Range from the user
		int range = Integer.parseInt(args[0]);
        int i,j,count;
        
        //finding prime numbers from 1 to given range.
        for(i = 1;i<=range;i++) {
        
        //Setting count to 0
        //Default is prime condition
         count = 0;

         for(j=2;j<=i/2;j++) {

            //Checking for non prime Number
             if(i%j==0){
                 count++;
             }
         }
        
        //Condition for being a prime
         if(count==0 && i!= 1)
           System.out.println(i);
        }
    }
}
