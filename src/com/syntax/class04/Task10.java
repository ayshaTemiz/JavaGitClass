package com.syntax.class04;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1=scan.nextInt();
		System.out.println("Please enter second number");
		int num2=scan.nextInt();
		System.out.println("Please enter third number");
		int num3=scan.nextInt();
		
		
		
		if(num1==num2 && num1==num3) {
			System.out.println("Numbers are equal");
		}else {
			if(num1>=num2 && num1>num3) {
				System.out.println(num1+" is the largest");
			}else if(num2>=num1 && num2>num3) {
				System.out.println(num2+" is the largest");
			}else if(num3>=num1 && num3>num2) {
				System.out.println(num3+" is the largest");
			}
			
		}
		
		
		
		

	}

}
