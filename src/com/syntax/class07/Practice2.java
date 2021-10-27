package com.syntax.class07;

public class Practice2 {

	public static void main(String[] args) {
		
		//print numbers from 1 to 100 in 1 line with space
		
		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");
		}
		
		//Print numbers from 100 to 1
		
		for(int x=100;x>=1;x--) {
			System.out.println(x);
		}
		
		//Print even numbers from 20 to 1 (2 ways)
		
		for(int y=20;y>=1;y--) {
			if(y%2==0) {
				System.out.println(y);
			}
		}
		
		//Print odd numbers between 20 and 50 (2 ways)
		
		for(int a=20;a<=50;a+=2) {
			System.out.println(a);
		}

		

	}

}
