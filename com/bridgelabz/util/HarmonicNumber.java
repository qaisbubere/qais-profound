/****************************************************************************** 
 *  Purpose: prints harmonic series.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
public class HarmonicNumber
{

  public static void main(String args[])
  {

    int inputNo=Integer.parseInt(args[0]);
    

	/*
	* harmonic 
	*/
      for( int i=1; i<=inputNo; i++)
       {
         System.out.print("1/"+i);
   
       if(i<inputNo)
      {
      System.out.print(" + ");
      }
       }
   }
 }
   
