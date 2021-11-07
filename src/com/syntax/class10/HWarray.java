package com.syntax.class10;

public class HWarray {

	public static void main(String[] args) {
		//Retrieving 1 element from 2D Array
		//Create a 2D array where you will store the following values:
		//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama. 
		//After storing values print the following String:
		//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

		
		String[][]  names= {
				{"Mrs.","Mr.","Ms.","Miss"},
				{"Smith","Obama","Jackson","Jordan"},
		};
		
	System.out.println(names[0][0]+names[1][0]);
	System.out.println(names[0][1]+names[1][1]);
	System.out.println(names[0][2]+names[1][2]);
	System.out.println(names[0][3]+" "+names[1][3]);
		
		
	}

}
