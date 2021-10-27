package com.syntax.class06;

public class WhileLoop {

	public static void main(String[] args) {
		
		
		

		int num = 14;

		if (num < 17) {
			System.out.println("It is a day");
		}

		while (num < 17) {
			System.out.println("Hello");
			num++; // to stop the looping	
		}
		
		
		System.out.println("I want to print numbers from 1 to 20");
		
		int num1=0;
		
		while(num1<20) {
			num1++;
			System.out.println(num1);
		}
		
		System.out.println("-------------------------------------");
		
		int i=1;
		
		while(i<=20) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("++++++++++++++++++++++++++++++");
		int x=50;
		
		while(x>=1) {
			
			System.out.println(x);
			x--;
		}
		
		

	}

}
