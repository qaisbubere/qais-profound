/******************************************************************************
 *  Purpose: program to produce runtime error java.lang.NoSuchMethodError
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/


public class LangError 
{

	public static void main(String args[]) 
	{

    	String a= "hello";     
        String call = errorFunction(a);
        System.out.println(call);
    	}

   	public static String eFunction(String x) 
	{
      	String y = new String();
      	return y; 
  	}
}
