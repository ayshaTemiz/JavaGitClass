package com.syntax.class4;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		System.out.println("Please enter your height");
		Scanner scan = new Scanner(System.in);
		
		double heights=scan.nextDouble();
		
		if(heights<=60) {
			System.out.println("You are a short person");
		}else if(heights>60 && heights<=72) {
			System.out.println("You are a medium person");
		}else if(heights>72) {
			System.out.println("You are a tall person");
		}else {
			System.out.println("Unknown height");
		}
	}

}
