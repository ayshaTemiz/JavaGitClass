package com.syntax.class14;

public class StringFunctions {

	public static void main(String[] args) {
		
       // Create a String that will hold a sentence. 
       //Write a program to get a new String without any spaces.

	    String str="Hello from Florida";
		System.out.println(str.replaceAll(" ", ""));
		
		
		
        //Create a String that should be combination of letters,
		//numbers and special characters.
		//Find out how many alpha characters are there in the String.
		
		
		String str2="$$ Today is 10 November::--)";
		String newStr=str2.replaceAll(" ", "");
		System.out.println(newStr.replaceAll ("[^A-Za-z]","").length());
		
		
		//You have a String a=”Is it saturday? 
		//Is it raining? Do we have a Java Class today?”
		//How would you find out how many sentences are in that String?

		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		System.out.println(a.split("[?.!]").length);
		
//		How would you reverse a String character by character?
		
		String myWord="November";
		for(int i=myWord.length()-1;i>=0;i--) {
			System.out.print(myWord.charAt(i)+" ");
		}
		
//		How would you reverse a String word by word?
		
		String str4 = "This is sentence i want to reverse";
		String [] strArr=str.split(" ");
		
		for(String word:strArr) {
			StringBuilder stringBuilder=new StringBuilder(word);
			System.out.print(stringBuilder.reverse()+" ");
		}
		
		
		
		
//		How would you check if String is palindrome or not?
		
		String pali="ANNA";
		String empty="";
		for(int x=pali.length()-1;x>=0;x--) {
			empty+=pali.charAt(x);
		}
		if(pali.equalsIgnoreCase(empty)) {
			System.out.println(pali+" is a palindrome");
		}else {
			System.out.println(pali+" is NOT a palindrome");
		}
		
		
		
		
//		How would you swap  2 strings without a temporary variable?
		System.out.println("---------------------");
		
		String swap1="Today";
		String swap2="Yesterday";
		
		
		String swap3=swap1.concat(swap2); //TodayYesterday
		swap2=swap3.replace(swap2,"");//Today
		swap1=swap3.replace(swap2,"");//Yesterday
		
		System.out.println("The swap1 value is "+swap1);
		System.out.println("The swap2 value is  "+swap2);
		
	}

}
