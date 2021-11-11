package com.syntax.class14;

public class SwapStrin {
public static void main(String[] args) {
	
	
	String name1="Ayse";
	String name2="Kazim";
	
	name1=name1+name2;
	
	name2=name1.replace(name2, "");
	name1=name1.replace(name2, "");
	
	System.out.println(name1);
	System.out.println(name2);
	
	
}
}
