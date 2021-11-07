package com.syntax.class11;

public class Dog {

	//Create a Dog Class and create 3 different objects of it:
    //Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	
	String color;
	String breed;
	int age;
	
	
	void bark() {
		System.out.println(breed + " can bark well");
	}
	void sleep() {
		System.out.println( age+ " years old  and "+color+" color " +breed+ " sleeps 8 hours a day");
	}
	
	public static void main(String []args) {
		
		Dog Husky=new Dog();
		Husky.age=5;
		Husky.breed="Siberian Husky";
		Husky.color="white";
		Husky.sleep();
		Husky.bark();
		
		Dog Bulldog=new Dog();
		Bulldog.age=10;
		Bulldog.breed="British Bulldog";
		Bulldog.color="black";
		Bulldog.sleep();
		Bulldog.bark();
		
	}
}
