package com.syntax.class18;

public class Teacher {
	//Write a Java program called Teacher.  Identify features and behaviour of that Class.
	//Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher 
	//that would have it their own features and behaviour. Test all 4 classes
	
	
	String name;
	String lastName;
	int salary;
	int workedYear;
	long phoneNumber;
	
	public void teachingHours() {
		System.out.println(name+" "+lastName+" can work only 22 hours a week");
	}
	
	public int totalPaid(int hours ) {
		
		return hours*20;
	}
	
}
