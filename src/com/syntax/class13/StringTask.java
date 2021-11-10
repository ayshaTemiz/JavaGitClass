package com.syntax.class13;

public class StringTask {

	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following:
		// if the String has an odd number of characters and has 3 or more characters,
		// print the character in the middle of the String.

		String myString = "hello";

		if (!(myString.isEmpty())) {
			if (myString.length() % 2 == 1 && myString.length() >= 3) {
				System.out.println(myString.length()/2);
			} else {
				System.out.println(
						"I cannot print this String.It has odd number of characters or has 3 or more characters");
			}

		} else {
			System.out.println("String is empty");
		}

		//Create a String and print it in reverse order (Sunday → yadnuS).

		String reverse = "okul";
//        String newStr="";  //hoca bu yontemle yapti
		for (int i = reverse.length() - 1; i >= 0; i--) {
//			newStr+=reverse.charAt(i);
			char printIt = reverse.charAt(i);
			System.out.print(printIt);
		}
//		System.out.println(newStr);
	}

}
