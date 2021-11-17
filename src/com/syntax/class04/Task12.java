package com.syntax.class04;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		
		System.out.println("Enter current time");
		Scanner scan = new Scanner(System.in);
		int time=scan.nextInt();
		
		
		String day=null;
		
		if(time>=1 && time <=11) {
			day="Morning";
		}else if(time>=12 && time<=15) {
			day="Afternoon";
		}else if(time>=16 && time<=20) {
			day="Evening";
		}else if(time>=21 && time<=24) {
			day="Night";
		}else {
			System.out.println("Invalid time");
		}
		
		System.out.println(day);
		

	}

}
