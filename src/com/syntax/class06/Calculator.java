package com.syntax.class06;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		//Using scanner class create calculator.
		//Allow user to enter 2 numbers and operator(+,-,*,/).
		//Based on operator provide the result to user.
		
		System.out.println("Enter first number");
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		System.out.println("Enter second number");
		int num2=scan.nextInt();
		System.out.println("Enter the operation you would like to do");
		char sign=scan.next().charAt(0);
		

		int addition=num1+num2;
		int subtraction=num1-num2;
		int multiplication=num1*num2;
		int divison=num1/num2;

	    int result = 0;
		
		switch(sign) {
		
		case '+':
			result=addition;
			break;
		
		case '-':
			result=subtraction;
			break;
		
		case '*':
			result=multiplication;
			break;
		case '/':
			result=divison;
			break;	
		}
		
		System.out.println(num1+""+sign+""+num2+"="+result);
	}
}
