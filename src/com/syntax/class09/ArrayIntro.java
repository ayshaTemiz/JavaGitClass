package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		//Create an array of words: Java, Saturday, day, coding, is.
		//Print the following sentence using elements of array: “Saturday is Java coding Day”.
		
		
		String []  words=new String[5];
		
		words[0]="Saturday";
		words[1]="is";
		words[2]="Java";
		words[3]="coding";
		words[4]="Day";
		
		//1st way,to access all elements from an array 
		for(int i=0;i<words.length;i++) {
			System.out.print(words[i]+" ");
		}
		
		//2nd way, to access all elements from an array we can use for each loop/advanced for loop/enhanced for loop
		//advanced for loop works only with array ,
		
		for(String anyName:words) {
			System.out.println(anyName);
		}
		
		
		
		
		//bu sekilde de store olur
		String [] fruit= {"apple","banana","grape"};
		
		System.out.println(fruit.length);
		
		

	}

}
