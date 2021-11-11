package com.syntax.class14;

public class Reverse {

	public static void main(String[] args) {
		
		//bu yontemi hoca yaptim farkli reverse
//		String str = "This is sentence i want to reverse";
//		String [] strArr=str.split(" ");
//		
//		for(String word:strArr) {
//			StringBuilder stringBuilder=new StringBuilder(word);
//			System.out.print(stringBuilder.reverse()+" ");
//		}
		
		System.out.println("---------------------------------------");
		
		String reverseWord="Tomorrow is a mistery";
		String[] arr=reverseWord.split(" ");
		for(int j=arr.length-1;j>=0;j--) {
			System.out.print(arr[j]+"   ");
		}
		
		
		
		

	}

}
