/****************************************************************************** 
 *  Purpose: Accept three names from user and print in reverse format.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
import java.util.Scanner;

public class PrintThreeNames
{
	
	public static void main(String args[])
	{
		
	Scanner Name = new Scanner (System.in);
		
	System.out.println("Enter three names:");
	String Name1 = Name.next();
	String Name2 = Name.next();
	String Name3 = Name.next();
		

	System.out.println("Hi\t"+Name3+"\t "+Name2+"\t"+Name1);
	}
}