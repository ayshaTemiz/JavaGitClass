package com.syntax.class07;

public class ForLoops {

	public static void main(String[] args) {
		
		//create calendar
		int num=2;
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
		
		System.out.println("======================");
		
		int result=1;
		for(int i=1;i<=4;i+=2) {
			result*=i;
		}
			
		System.out.println(result);

	}

}
