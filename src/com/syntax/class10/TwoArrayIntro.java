package com.syntax.class10;

public class TwoArrayIntro {

	public static void main(String[] args) {
		
		
		int [][]  bigArray=new int [3][3]; //9 elements //first one rows,second [] columns
		
		bigArray [0][0]=10;
		bigArray [0][1]=20;
		bigArray [0][2]=4;
		
		bigArray [1][0]=1;
		bigArray [1][1]=2;
		bigArray [1][2]=3;
		
		bigArray [2][0]=50;
		bigArray [2][1]=44;
		bigArray [2][2]=99;
		
		System.out.println(bigArray [2][2]);
		System.out.println(bigArray.length);//returns how many array there are. 3
		

	}

}
