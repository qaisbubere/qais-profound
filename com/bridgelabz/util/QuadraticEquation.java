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
	
	//double root1,root2,delta;
	Scanner value = new Scanner(System.in);
	System.out.println("given quadratic equation: ax^2+bx+c");


	System.out.println("enter a:");
	int a = value.nextInt();
	System.out.println("enter b:");
	int b = value.nextInt();
	System.out.println("enter c:"); 
	int c = value.nextInt();
	System.out.println("given quadratic equation " +a+ "x^2 + " +b+ "x + " +c);
	double delta = (b * (b-4) * a * c);
	

	
	if(delta > 0)
	{
	System.out.println("roots are real and unequal");
	double root1 = (- b + Math.sqrt(delta)) / (2 * a);
	double root2 = (- b - Math.sqrt(delta)) / (2 * a);
	System.out.println("first root  is:" + root1);
	System.out.println("second root is:" + root2);
	} 
		
	else if(delta == 0)
	{
	System.out.println("roots are real and equal");
	double root1 = ( - b + Math.sqrt(delta)) / (2 * a);
	System.out.println("root1:" + root1);
	}
		
	else
	{
	System.out.println("roots are imaginary");
	}
	}
}

 
 