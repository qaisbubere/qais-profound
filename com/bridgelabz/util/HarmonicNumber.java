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
	int InputNumber=Integer.parseInt(args[0]);
    
      	for( int i=1; i<=InputNumber; i++)
       	{
         System.out.print("1/"+i);
   
       		if(i < InputNumber)
      		{
      		System.out.print(" + ");
      		}
       	}
   }
 }
   
