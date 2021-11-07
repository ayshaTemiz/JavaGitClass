package com.syntax.class12;

public class TaskFirst {
	//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	
	public  int findLargest (int num1,int num2) {
		
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	public static void main (String[]args) {
		
		TaskFirst obj1=new TaskFirst();
		System.out.println(obj1.findLargest(55, 11));
		System.out.println(obj1.findLargest(3, 14));
	}
	
}
