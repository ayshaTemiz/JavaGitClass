package com.syntax.class09;

public class ArrayTask {

	public static void main(String[] args) {
		
		
		//create an array of chars and store grades into it : A,B,C,D,E,F.
		//Then print a grade B (use 2 different ways f creating an array)
		
		
		//1st way
		char [] grades=new char[6];
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		
		//2nd way
		char[] myGrades= {'A','B','C','D','E','F'};
		
		System.out.println(myGrades[1]);
		
		
		
		System.out.println(	grades[1]);  // print a grade B
		
		

	}

}
