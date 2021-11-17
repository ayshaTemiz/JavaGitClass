package com.syntax.class16;

public class Task2 {
	//Create a method that will take a String as a parameter and returns reversed String. 
	//Method should be available to all classes within your project and accessible by class name.
	
	
	public static String reverseString(String a) {
				
	return new StringBuilder(a).reverse().toString();
	
//	uzun sekli
//	StringBuffer print=new StringBuffer(a);
//	String myPrint=print.reverse().toString();
//	return myPrint;
		
	}

	
	
	
	
}
