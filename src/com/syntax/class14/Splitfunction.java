package com.syntax.class14;

import java.util.Arrays;

public class Splitfunction {

	public static void main(String[] args) {
	String str="Today is Tuesday.I love java";
	String[]  arr=str.split("[.]");
	System.out.println(Arrays.toString(arr));
	
	String[]  arr1=str.split("[T]"); //T yi almadan T gordgugu yeri ayirir
	System.out.println(Arrays.toString(arr1));
	
	String[]  arr3=str.split("Today");
	System.out.println(Arrays.toString(arr3));
	
	for(String x:arr) {
		System.out.println(x);
	}
	}

}
