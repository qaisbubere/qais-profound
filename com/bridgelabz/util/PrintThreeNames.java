/****************************************************************************** 
 *  Purpose: Accept three names from user and print in reverse format.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

 /*
 *import statements
 */
import java.util.Scanner;

public class PrintThreeNames
{
	
	public static void main(String args[])
	{
		
	Scanner s = new Scanner (System.in);
		
	/*
	* Accept three strings from user
	*/
	System.out.println("Enter three names:");
	String S1 = s.next();
	String S2 = s.next();
	String S3 = s.next();
		
	/*
	* Print string in reverse format
	*/
	System.out.println("Hi\t"+S3+"\t "+S2+"\t"+S1);
	}
}