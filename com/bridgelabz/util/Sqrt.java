/****************************************************************************** 
 *  Purpose: determines the square root of a given number.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

public class Sqrt 
{ 
    public static void main(String[] args) 
{ 

        // read in the command-line argument
        double c = Double.parseDouble(args[0]);
        double epsilon = 1e-15;    
        double t = c;              

        // formula for square root
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }

        // print out the estimate of the square root of c
        System.out.println(t);
    }

}
