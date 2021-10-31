package com.syntax.class08;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {

		// 3. Write a program that reads a range of integers (start and end point),
		// provided by a user and then from that range prints the sum of the even and
		// odd integers.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer value as a starting point");
		int num1=scan.nextInt();
		System.out.println("Enter an integer value as a ending point");
		int num2=scan.nextInt();
		int sumEven=0;
		int sumOdd=0;
		
		for (int i=num1;i<=num2;i++) {
			
			if (i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}
		
		System.out.println("Even numbers total value is "+sumEven);
		System.out.println("Odd numbers total value is "+sumOdd);
		
		

		// 4. Complete clock assignment
		
		

	}

}
