package com.syntax.class12;

public class Task1 {
	//Create a method createEmail(). Based on values of users name, lastName and email type, 
	//your method should return complete email Address.
	//Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com 
	
	String createEmail(String userName, String lastName,String emailType) {
		 
		String fullStatement=userName+lastName+"@"+emailType+".com";
		return fullStatement;
	}
	
	public static void main(String[] args) {
		
		Task1 obj1=new Task1();
		System.out.println(obj1.createEmail("ays", "temiz", "gmail"));

	}
	
	
	
	

}
