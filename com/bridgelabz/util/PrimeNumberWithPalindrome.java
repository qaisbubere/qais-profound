/****************************************************************************** 
*  Purpose:  Determines how many prime numbers exist between 0 to 100000.
	    find out, how many numbers are palindrome among those prime numbers.
 *
 *  @author Qais Bubere
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

/*
 * JAVA STYLE GUIDE - PACKAGE NAMING STYLE
 */

package com.bridgelabz.util;

import java.util.*;

class PrimeNumberWithPalindrome
{
	public static void main(String args[])
{

	int counter=0;

for(int i=1; i<100000; i++)
{
	if(i % 2 == 0)
	{
	counter++;
	}
}

	System.out.println("\n"+counter);
}
}
