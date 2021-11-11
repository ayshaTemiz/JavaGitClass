package com.syntax.class15;

public class StrngBuilder {

	public static void main(String[] args) {
		
		
		StringBuilder stringBuilder= new StringBuilder();
        for(int i=0;i<5;i++) {
        	stringBuilder.append(i);
        }
        System.out.println(stringBuilder);
        
        
        String name="I love yo my family";
        StringBuilder  cs= new StringBuilder(name);
       
        System.out.println(cs.reverse());

	}

}
