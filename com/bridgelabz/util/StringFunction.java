import java.util.Scanner;
public class StringFunction
{

	static int i , j;

	//mothod for anagram
	/*public boolean isAnagram( String str1,String str2)
	{			
		int length1=str1.length();
		int length2=str2.length();

		char [] array1 = str1.toCharArray();
		str1.toLowerCase();
		char [] array2 = str2.toCharArray();
		str2.toLowerCase();

		if(length1 == length2)
		{

		for(array1[i]=0; array1[i]<length1; i++)
		{
			for(array2[j]=0; array2[j]<length2; j++)
			{
				if(array1[i] == array2[j])
				{				
				array2[j] = '$';
				i++;
				}
				else
				{
				j++;
				}
			array2[j] = 0;
			}
		}
			return true;
	}

		else
		{
		return false;
		}

	} */

	//method for palindrome
	public boolean isPalindrome(String str)
	{
boolean isPal=false;
	str.toLowerCase();
	char[] array1 = str.toCharArray();
	//char[] array2 = str.toCharArray();
	
	int length = str.length();
	
	for(i = 0; i<length; i++)
	{
		for(j=length-1; j>length; j--)
		{
			if(array1[i] != array1[j])
			{
				isPal=false;
			}
            else{
                 isPal = true;
             }
			
		}
	}
	return isPal;
	}

	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			StringFunction stringFunction=new StringFunction();


			//this is for anagram
			/*			
			System.out.println("Enter First String:");
			String s1=sc.nextLine();
			

			System.out.println("Enter Second String:");
			String s2=sc.nextLine();
			
		
			boolean status = stringFunction.isAnagram(s1,s2);
			if(status == true)
				{
					System.out.println("Given Strings sre Anagram");
				}
				else{
					System.out.println("Given Strings are not Anagram");
					}
				*/

			System.out.println("Enter a String:");
			String s1=sc.nextLine();
			boolean status = stringFunction.isPalindrome(s1);
				if(status == true)
				{
					System.out.println("Given string is palindrome");
				}
				else{
					System.out.println("Given String is not palindrome");
					}
	}
}
