/******************************************************************************
 *  Purpose: program to produce runtime error java.lang.NoSuchMethodError
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
/*
* Generate Runtime Error
*/

blic class LangError {

  public static void main(String args[]) {

    String a= "hello";

        //Calling a method
        String call = errorFunction(a);
        System.out.println(call);
    }

    /** returns the minimum of two numbers */
    public static String eFunction(String x) {
      String y = new String();
      
      return y; 
  }
}
