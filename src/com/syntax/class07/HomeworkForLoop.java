package com.syntax.class07;

public class HomeworkForLoop {

	public static void main(String[] args) {
		// to calculate sum of all even number from range 1 to 100
		
		int result=0;
		
		for (int i=0;i<=100;i+=2) {
			result+=i;
		}
		System.out.println(result);
		
		// to calculate sum of all odd numbers from range 1 to 100
		
       int result2=1;
		
		for (int a=1;a<=100;a+=2) {
			result2+=a;
		}
		System.out.println(result2);
	}
}
