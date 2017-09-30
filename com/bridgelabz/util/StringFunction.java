/******************************************************************************
 *  Purpose: Program to perform various functions on String.
 * 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   19-09-2017
 *
 ******************************************************************************/
import java.util.Scanner;
 public class StringFunction
 {
	static int i,j;
	static int count=0;
 
 	public boolean isAnagram(String str1,String str2)
	{
		boolean stringIsAnagram = false;
 		int length1=str1.length();
 		int length2=str2.length();
		str1.toLowerCase();
		str2.toLowerCase();
		char [] array1 = str1.toCharArray();
 		char [] array2 = str2.toCharArray();
		
		
		// method for anagram
		if(length1==length2) 
		{
			for(i=0;i<length1;i++) 
			{
				for(j=i+1;j<length1;j++) 
				{
					if (array1[i]>array1[j])
					{
						char temp=array1[i];
						array1[i]=array1[j];
						array1[j]=temp;
					}
				}
			}
		
		
			for(i=0;i<length2;i++) 
			{
				for(j=i+1;j<length2;j++) 
				{
					if (array2[i]>array2[j])
					{
						char temp=array2[i];
						array2[i]=array2[j];
						array2[j]=temp;
					}
				}							
			}
			
			
			
			for(i=0;i<length1;i++) 
			{
				if(array1[i]==array2[i]) 
				{
					count++;
					//System.out.println("Strings are anagram");
				}
			}
			if(count==length1)
			{
				stringIsAnagram = true;
			}
			else
			{
				stringIsAnagram = false;
			}
		}
			
			else
			{
				return stringIsAnagram;
			}
		return stringIsAnagram;
    }
	
 	//method for palindrome
 	public boolean isPalindrome(String str)
 	{
	boolean stringIsPalindrome=false;
 	str.toLowerCase();
 	char[] array1 = str.toCharArray();
 	//char[] array2 = str.toCharArray();
 	
 	int length = str.length();
 	
 	for(i=0,j=length-1; i<length&j>0; i++,j--)
 	{
 		//for(j=length-1; j>0; j--)
 		
 			if(array1[i] == array1[j])
 			{
 				stringIsPalindrome=true;
 			}
             else
			{
                  stringIsPalindrome = false;
            }
				
		
 	}
 	return stringIsPalindrome;
 	}
 
 
 	public static void main(String[] args)
 	{
 		Scanner sc=new Scanner(System.in);
 		StringFunction stringFunction=new StringFunction();
 
 
 		//this is for anagram
 		
		System.out.println("program for Anagram.")
 		System.out.println("\n Enter First String:");
 		String string1=sc.nextLine();
 			
 		System.out.println("\n Enter Second String:");
 		String string2=sc.nextLine();
 					
 		boolean statusOfAnagram = stringFunction.isAnagram(string1,string2);
 		if(statusOfAnagram == true)
 			{
 				System.out.println("\n Given Strings are Anagram \n");
 			}
 			else
			{
 				System.out.println("\n Given Strings are not Anagram \n");
 			}
 		
		
		// this is for palindrome
		
		System.out.println("\n\n program for Palindrome. \n")
 		System.out.println("\n Enter a String:");
 		String s1=sc.nextLine();
 		boolean statusOfPalindrome = stringFunction.isPalindrome(s1);
 			if(statusOfPalindrome == true)
 			{
 				System.out.println("\n Given string is palindrome \n");
 			}
 			else
			{
 				System.out.println("\n Given String is not palindrome \n");
 			}
			
			
		//this is for 
 	}
 }