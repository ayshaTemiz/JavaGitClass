package com.syntax.class15;

public class Students {
// Create a Class called Students
//	Create three  variables  studentName , studentID  and  numberOfStudents
//	Create three objects of the Students Class 
//	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//	Print out  total number of students
	
	String studentName;
	int studentID;
	static int numberOfStudents=30;
	
	public static void main(String[] args) {
		
		Students obj1=new Students();
		obj1.studentName="Aysha";
		obj1.studentID=33355577;
		numberOfStudents++;
		System.out.println(Students.numberOfStudents);
		
		Students obj2=new Students();
		obj2.studentName="Merry";
		obj2.studentID=20905567;
		numberOfStudents++;
		System.out.println(Students.numberOfStudents);
		
		Students obj3=new Students();
		obj3.studentName="Vanessa";
		obj3.studentID=11882334;
		numberOfStudents++;
		System.out.println(Students.numberOfStudents);
		
		
	}
}
