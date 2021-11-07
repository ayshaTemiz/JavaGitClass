package com.syntax.class12;

public class Task03 {
	//Create a method that will say Hello in different language based on the country 
	//that will passed when method is executed.
	
	
	void greeting(String country) {
	    String salute;
		switch (country) {
		case "Turkey":
			salute="Merhaba";
			break;
		case "USA":
			salute="Hello";
			break;
		case "Mexico":
			salute="Hola";
			break;
		case "French":
			salute="Bonjour";
			break;
		case "Russian":
			salute="Привет";
			break;
			default:
				salute="Unknown country";	
		}
		System.out.println(salute);
	}
	public static void main(String[] args) {
		Task03  obj=new Task03();
		obj.greeting("Mexico");
	}
	
}
