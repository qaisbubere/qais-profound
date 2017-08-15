/****************************************************************************** 
 *  Purpose: determines the second largest and second smallest number.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
import java.util.Scanner;

public class SecondLargest_Smallest
{
    public static void main(String[] args) 
    {
        int temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int Number = scanner.nextInt();

	
        int array[] = new int[Number];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < Number; i++) 
        {
            for (int j = i + 1; j < Number; j++) 
            {
                if (array[i] > array[j]) 
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second Largest:"+array[Number-2]);
        System.out.println("Second Smallest:"+array[1]);
    }
}
