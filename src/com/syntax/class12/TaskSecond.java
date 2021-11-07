package com.syntax.class12;

public class TaskSecond {
	//Create a method that will take a number and prints whether the number is even or odd.
	
	boolean EvenOrOdd (int num) {
		
		boolean even;
		if (num%2==0) {
			even=true;
		}else {
			even=false;
		}
		return even;
	}
	
	public static void main(String[]args) {
		TaskSecond  obj2=new TaskSecond();
		System.out.println (obj2.EvenOrOdd(8));
	}
		
}
