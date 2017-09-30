/******************************************************************************
 *  Purpose: Program to perform various Math functions.
 * 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   28-09-2017
 *
 ******************************************************************************/
 
 import java.util.*;
 import java.lang.*;
 import java.util.Scanner;
 public class MathFunction
 {
	 static int Numerator = 1 , Denominator = 1, i = 1 , degree,  decimal, count = 0, remaining , primenumber, rate, cash, time; 
	 double Radians, sin, cosine; 
	 String binaryNumber = "";
	 Scanner scanner = new Scanner(System.in);
	 
	 //method for harmonic number
	 public void harmonicNumber(int n)
	 {
			
		 while(i<= n)
		 {
			System.out.print(Numerator+ "/" +Denominator);
			if(Denominator < n)
			System.out.print(" + ");
			Denominator = Denominator + 1;
			i++;
		 }
	 } 
	
	 //method for sin angle
	 public void Sin(int deg)
	 {
		 Radians = (deg*3.14)/180;
		 sin = Math.sin(Radians);
		 System.out.println("Math.sin ("+deg+") = " + sin);
	 }
	 
	 
	 //method for cosine angle
	 public void Cosine(int deg)
	 {
		 Radians = (deg*3.14)/180;
		 cosine = Math.cos(Radians);
		 System.out.println("Math.cos ("+deg+") = " + cosine);
	 }
	 
	 
	 //method for binary value
	 public void Binary(int dec)
	 {
		 while(dec > 0)
        {
            remaining = dec % 2;
            binaryNumber = binaryNumber + remaining;
            dec = dec / 2;
        }
		
		int length = binaryNumber.length();
		System.out.print("binary value is :");
		for(int i=length-1;i>=0;i--)
		{
        System.out.print(binaryNumber.charAt(i));    
		}
	 }
	 
	 
	 //method for prime number
		public boolean prime(int number)	
		{
		count = 0;
		boolean isPrime = false;
		for(int i=1; i<=number; i++){
			if(number % i== 0)
			{
			count++;
			}
		}
		if(count == 2){
			return true;
		}
		else
			return false;
		}	


		//method for factorial
		public void isFactorial(int number)
		{
			int fact=1;
			for(int i=1;i<=number;i++){
				fact = fact*i;
			}
			System.out.println("factorial of "+number+" is "+fact);
		}
		
		
		//method to find compound interest for presentValue
		public static void compoundPresent(int rate, int cash, int time)
		{
			double compound = cash / (Math.pow(1+rate,time));
			System.out.println(" compound interest is " +compound);
		}
		
		
		//method to find compound interest for futureValue
		public static void compoundFuture(int rate, int cash, int time)
		{
			double compound = cash * (Math.pow(1+rate,time));
			System.out.println(" compound interest is " +compound); 
		}
		
		
		//method for min and max value from an array of integers
		public void minAndMaxInt(int size)
		{
			int [] array = new int[size];
			System.out.println("enter "+size+" integer elements");
			for(int i=0; i<size; i++)
			{
				array[i] = scanner.nextInt();
			}
			
			for(int i=0; i<size; i++)
			{
				for(int j=i+1; j<size; j++)
				{
					if(array[j] < array[i])
					{
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
			System.out.println("minimum value is"+array[0]);
			System.out.println("maximum value is"+array[size-1]);
		}
		
		
		//method for finding min and max value from string
		public void minAndMaxString(int size)
		{
			String str;
			char [] array = new char[size];
			System.out.println("enter elements");
			for(int i=0; i<size; i++)
			{
				str  = scanner.nextLine();
			}
			
			for(int i=0; i<size; i++)
			{
				for(int j=i+1; j<size; j++)
				{
					if(str.charAt[j] < str.charAt[i])
					{
						char temp = str.charAt[i];
						str.charAt[i] = str.charAt[j];
						str.charAt[j] = temp;
					}
				}
			}
			System.out.println("minimum value is"+str.charAt[0]);
			System.out.println("maximum value is"+str.charAt[size-1]);
		}
	 
	 public static void main(String[]args)
	 {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("1: harmonic \t 2: sin of an angle \t 3: cosine of an angle \t 4: binary \t 5: square root \t 6: prime number \t 7: factorial \t 8: compound interest for present \t 9: compound interest for future \t 10: min & max values from integers \t 11: min and max values from string \t 12: collinear");
		 int choice = scanner.nextInt();
		 MathFunction mathfunction = new MathFunction();
		 
		 switch(choice)
		 {
			case 1:
			System.out.println("enter number to find its harmonic number");
			int number = scanner.nextInt();
			mathfunction.harmonicNumber(number);
			break;

			case 2:
			System.out.println("enter value in degree");
			degree = scanner.nextInt();
			mathfunction.Sin(degree);
			
			case 3:
			System.out.println("enter value in degree");
			degree = scanner.nextInt();
			mathfunction.Cosine(degree);
			
			case 4:
			System.out.println("enter decimal value");
			decimal = scanner.nextInt();
			mathfunction.Binary(decimal);
			
			case 6:
			System.out.println("enter a number to find out whether it is prime number or not");
			primenumber = scanner.nextInt();
			boolean isPrime = mathfunction.prime(primenumber);
			System.out.println(isPrime);
			
			case 7:
			System.out.println("enter number to find its factorial");
			int factorial = scanner.nextInt();
			mathfunction.isFactorial(factorial);
			
			case 8:
			System.out.println("enter compound interest rate, cash, and time");
			rate = scanner.nextInt();
			cash = scanner.nextInt();
			time = scanner.nextInt();
			mathfunction.compoundPresent(rate,cash,time);
			
			case 9:
			System.out.println("enter compound interest rate, cash, and time");
			rate = scanner.nextInt();
			cash = scanner.nextInt();
			time = scanner.nextInt();
			mathfunction.compoundFuture(rate,cash,time);
			
			case 10:
			System.out.println("enter size of array");
			int sizeOfArray = scanner.nextInt();
			mathfunction.minAndMaxInt(sizeOfArray);
			
			case 11:
			System.out.println("enter size of array");
			int size = scanner.nextInt();
			mathfunction.minAndMaxString(size);
			
			}
			
	 }
 }