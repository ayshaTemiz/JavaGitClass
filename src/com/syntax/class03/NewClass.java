package com.syntax.class03;

public class NewClass {

	public static void main(String[] args) {

		// What will be the output of the following program?// answer ;f, d and i are equal

		float f = 75.0f;
		double d = 75.0;
		int i = 75;

		if (f == d) {
			if (f == i) {
				System.out.println("f, d and i are equal");
			} else {
				System.out.println("f, d are equal but i is not equal");
			}

		} else {
			System.out.println("f and d are not equal");
		}

		
		
		
		
		
		
		
		   //What will be the output of the following program?//answer;Both are not equal

			
				   float fl = 5.3f;
				   if (fl == 5.3) {
				      System.out.println("Both are equal");
				   } else {
				      System.out.println("Both are not equal");
				   }
				
		
		
		
		
		
		
		

		// What value is assigned to discount ? //answer is 0.3
		double discount;
		char code = 'C';

		switch (code) {
		case 'A':
			discount = 0.0;

		case 'B':
			discount = 0.1;

		case 'C':
			discount = 0.2;

		default:
			discount = 0.3;
		}

	}
}
