package com.syntax.class10;

public class Task06 {

	public static void main(String[] args) {
		
		
			//Write a program to swap 2 numbers without a temporary variable? java
			int a=10; int b=25;
			System.out.println("the value of a is "+ a);
			System.out.println("The value of b is "+b);
			
			a=a+b; //10+25=35
			b=a-b;	//35-25=10
			a=a-b;	//35-10=25
			System.out.println("......After swaping the number......");
			
			System.out.println("the value of a is "+ a);
			System.out.println("The value of b is "+b);

	}

}
