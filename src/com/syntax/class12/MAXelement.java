package com.syntax.class12;

public class MAXelement {

	public static void main(String[] args) {
		
		int[]  numbers= {10,88,-44,0,1001};
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MAX_VALUE;
		
		for(int n:numbers) {
			if(n>largest) {
				secondLargest=largest;
				
			}
		}

	}

}
