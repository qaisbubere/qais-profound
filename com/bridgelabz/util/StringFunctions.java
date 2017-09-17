import java.util.Scanner;
public class StringFunctions
{

	static int i , j;
	public boolean isAnagram( String str1,String str2)
	{			
		int length1=str1.length();
		int length2=str2.length();

		char [] array1 = str1.toCharArray();
		str1.toLowerCase();
		char [] array2 = str2.toCharArray();
		str2.toLowerCase();
			if(length1 == length2)
			{
				
				for(array1[i]=0; i<length1; i++)
				{
					for(array2[j]=0; j<length1; j++)
					{
						if(array1[i] != array2[j])
						{
							j++;												
						}
						
					}			
				
				}
					else
						{
						return	false;
						}
			}
				else
				{
				System.out.println("Given Strings are not Anagram");
				return false;
				}

				return true;
	}

	public static void main(String [] args)
	{
			Scanner sc=new Scanner(System.in);
			StringFunctions stringFunction=new StringFunctions();

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
}
}
