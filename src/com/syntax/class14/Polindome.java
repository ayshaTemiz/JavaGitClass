package com.syntax.class14;

public class Polindome {

	public static void main(String[] args) {
		//How would you check if String is palindrome or not?
				String str="anna";
				StringBuilder strB=new StringBuilder(str);
				strB.reverse();
				if(str.equals(strB.toString())) {
					System.out.println(str+" is a palindrome");
				}else {
					System.out.println(str+" Not is a palindrome");
				}

	}

}
