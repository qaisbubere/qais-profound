/****************************************************************************** 
 *  Purpose: find out roots of given quadratic equation.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
import java.util.Scanner;

public class QuadraticEquation
{
	public static void main(String args[])
	{
	
	double root1,root2,d;
	Scanner s = new Scanner(System.in);
	System.out.println("given quadratic equation: ax^2+bx+c");

/*
* three inputs from user
*/
	System.out.println("enter a:");
	int a = s.nextInt();
	System.out.println("enter b:");
	int b = s.nextInt();
	System.out.println("enter c:"); 
	int c = s.nextInt();
	System.out.println("given quadratic equation " +a+ " " +b+ " " +c);
	d = (b * (b-4) * a * c);
	

	/*
	* two possible roots
	*/
	if(d > 0)
	{
	System.out.println("roots are real and unequal");
	root1 = (- b + Math.sqrt(d)) / (2 * a);
	root2 = (- b - Math.sqrt(d)) / (2 * a);
	System.out.println("first root  is:" + root1);
	System.out.println("second root is:" + root2);
	} 
		
	else if(d == 0)
	{
	System.out.println("roots are real and equal");
	root1 = ( - b + Math.sqrt(d)) / (2 * a);
	System.out.println("root:" + root1);
	}
		
	else
	{
	System.out.println("roots are imaginary");
	}
	}
}

 
 