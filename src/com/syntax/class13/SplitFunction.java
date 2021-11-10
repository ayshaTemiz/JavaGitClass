package com.syntax.class13;

public class SplitFunction {

	public static void main(String[] args) {
		
		
		String str="This is Batch 11 hello";
		String []   arr=str.split(" ");
//		String []   arr=str.split(".");   ("[.]")  seklinde yazmalisin.regular expression olmali. yoksa outOf bounds exception error oralrk hata verir
		
		for(String  a:arr) {
			System.out.println(a);
		}
		
		System.out.println("--------------------");
		//print only "Batch"
		System.out.println(arr[2]);
		
		
		
		

	}

}
