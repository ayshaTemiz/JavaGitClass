package com.syntax.class10;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
	
		//Write a java program to check whether a given number is prime or not?
		
		Scanner input=new Scanner(System.in);
		int num=0;
		int check=2;
		boolean prime=true;
		do {
			System.out.println("Please enter a positive number, and I will check if it is a Prime number of not");
			num=input.nextInt();
		}while(num<=0);
		do {
			int result=num%check;
			check++;
			if(result==0) {
				prime=false;
				break;
			}
		}while(check<num);
		if(prime==false) {
			System.out.println(num+" is not a Prime number.");
		}else {
			System.out.println(num+" is a Prime number.");
		}
		input.close();

	}

}
