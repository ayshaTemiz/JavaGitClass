package com.syntax.class4;

public class Donor {

	public static void main(String[] args) {
		//Create a Java program and call it a Donor.
		//In order to be eligible to donate your blood you have to be 18 years old.
		//Also once you identify age eligibility then we have to see 
		//if person matches weight requirements.
		//If person weight it more than 110 lbs → then he/she is eligible, 
		//otherwise we cannot accept such a patient.
		
		
		int age=20;
		int weight=200;
		
		if(age>=18) {
 System.out.println("You can donate your blood");
			if(weight>=110) {
				System.out.println("You are eligible");
			}else {
				System.out.println("We cannot accept such a patient");
			}
		}else {
			System.out.println("You cannot eligible to donate");
		}

	}

}
