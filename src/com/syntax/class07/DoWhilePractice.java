package com.syntax.class07;

public class DoWhilePractice {

	public static void main(String[] args) {
		// print numbers from 30 to 70 using do while loop 
		
		
		int i=30;
		
		do {
			System.out.println(i);
			i++;
		}while(i<=70);
		
		System.out.println("------------------");
		
		//print odd numbers from 99 to 1 using do while
		
		int x=99;
		
		do {
			if(x%2==1) {
				System.out.println(x);	
			}
			x--;
			}while(x>=1);
			
	}

}
