/****************************************************************************** 
 *  Purpose: Determines wheather the given date comes in spring season or not.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

public class SpringSeason{
  
   public static void main(String args[]) {
 
/*
* take month and day from command line
*/

   int month=Integer.parseInt(args[0]);
   int day=Integer.parseInt(args[1]);

      boolean isSpring=(month==3 && day>=20 && day<=31)
                    || (month==4 && day>=1 && day<=30)
                    || (month==5 && day>=1 && day<=31)
                    || (month==6 && day>=1 && day<=20);

    System.out.println(isSpring);
 }
  }