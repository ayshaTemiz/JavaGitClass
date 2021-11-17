package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=true;
		int dose=2;
		
		if(vaccine) {
			System.out.println("How many doses you have goten?");
			if(dose==1) {
				System.out.println("when have you gotten your 2nd dose?");
			}else {
				System.out.println("You are fully vaccineted");
			}
		}
				
		

	}

}
