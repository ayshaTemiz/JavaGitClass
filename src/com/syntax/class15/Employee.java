package com.syntax.class15;

public class Employee {
//	Create a Class called Employee:
//	Create three  variables  empID , salary and set the CEO to “Sumair” 
//	Create two objects of the class Employee 
//	Set the value of eID, salary for each of the objects
//	Print out the eID , salary and  CEO for each of the objects
	
	
	int empID;
	int salary;
	static String cEO="Sumair";
	
	public static void main(String[] args) {
		Employee obj1=new Employee();  //1st Object
		obj1.empID=6677899;
		obj1.salary=120000;
		
		System.out.println(obj1.empID);
		System.out.println(obj1.salary);
		System.out.println(Employee.cEO);
		
		Employee obj2=new Employee();  //2nd Object
		obj2.empID=1100935;
		obj2.salary=90000;
		
		System.out.println(obj2.empID);
		System.out.println(obj2.salary);
		System.out.println(Employee.cEO);
		
	}
	
	
}
