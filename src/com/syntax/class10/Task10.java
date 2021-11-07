package com.syntax.class10;



public class Task10 {

	public static void main(String[] args) {
		
		//Write a java program to find the second largest number in the array
		
	    int arr[] = { 10, 25, 888, 95, 72, 50, 26, 41, 6, 100 };
	    int largest = arr[0];
	    int secondLargest = arr[0];
	   
	    System.out.println("The given array is:" );
	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i]+"\t");
	    }
	    for (int i = 0; i < arr.length; i++) {
	
	      if (arr[i] > largest) {
	        secondLargest = largest;
	        largest = arr[i];
	
	      } else if (arr[i] > secondLargest) {
	        secondLargest = arr[i];
	      }
	    }
	    System.out.println("\nSecond largest number is:" + secondLargest);
		
		
		
		
	}
}





