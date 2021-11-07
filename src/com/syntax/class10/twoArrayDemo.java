package com.syntax.class10;

public class twoArrayDemo {

	public static void main(String[] args) {
	
		String[][]  groceries= {
				{"banana","apple","mango"},	
				{"car","train","bus","plane"},
				{"table","tv"},	
		};
		
		//how many elements I have in first array
		System.out.println(groceries[0].length); //first array element sayisi
		System.out.println(groceries[1].length);//second array element sayisi
		System.out.println(groceries[2].length);//third array element sayisi

	}

}
