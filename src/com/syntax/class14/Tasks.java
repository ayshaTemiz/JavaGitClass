package com.syntax.class14;

public class Tasks {

	public static void main(String[] args) {
		//How would you reverse a String 
//		character by character?
		
		String str="Today is Tuesday";
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
		
		
		
		
//		2. How would you reverse a String word by 
//		word?
		
		
		
//		3. How would you check if String is 
//		palindrome or not?
		
		String str3="good";
		
		for(int i=str3.length()-1;i>=0;i--) {
			str3.charAt(i);
			if(str3.equals(str3.charAt(i)))
			System.out.println();
		}
		
		
		
//		4. How would you swap  2 strings without 
//		a temporary variable?

	}

}
