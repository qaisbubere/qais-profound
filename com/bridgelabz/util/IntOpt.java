/****************************************************************************** 
 *  Purpose: enter 3 numbers and perform various operations.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
import java.util.*;

public class IntOpt
{
	public static void main(String args[])
	{

	/*
	* Enter three inout at run time
	*/
	int mOperation1, mOperation2, mOperation3, mOperation4;
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);
		

	/*
	*operations of three numbers
	*/
	mOperation1 = a + (b * c);
	mOperation2 = (a * b) + c;
	mOperation3 = c + (a / b);
	mOperation4 = (a % b) + c;
		
	System.out.println (" operation 1 is :" + mOperation1);
	System.out.println (" operation 2 is :" + mOperation2);
	System.out.println (" operation 3 is :" + mOperation3);
	System.out.println (" operation 4 is :" + mOperation4);
	}
}