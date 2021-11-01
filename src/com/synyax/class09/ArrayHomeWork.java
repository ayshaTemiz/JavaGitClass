package com.synyax.class09;

public class ArrayHomeWork {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Using 2 different loops
		// print all values from the array.

		String[] cars = { "AUDI", "Honda", "BMW", "Chevrolet", "Cadillac", "Alfa Romeo" };
		// 1st way
		for (String a : cars) {
			System.out.println(a);
		}

		System.out.println("-----------------------");

		// 2nd way
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		System.out.println("===============================");
		// Create an array of animals and store 6 elements into it. Using 2 different
		// loops print all elements from the array.
		String[] animals = { "snake", "bear", "bird", "fish", "goat", "cow" };
		// 1st way
		for (String an : animals) {
			System.out.println(an);
		}

		System.out.println("-----------------------");
		// 2nd way

		for (int j = 0; j < animals.length; j++) {
			System.out.println(animals[j]);
		}
        System.out.println("===============================");
		// Create an array to store double values and then print those in reverse order
		double[] numbers= {10.55,07.99,11.88,22.66};
		
		for(int x=numbers.length-1;x>=0;x--) {
			System.out.println(numbers[x]);
		}
		
        System.out.println("---------------------------");
		// Create an array on integers and calculate the sum of all elements in an array
		int[] myNumbers= {3,5,10,1};
		int sum=0;
		
		for(int m:myNumbers) {
			sum+=m;
		}
		System.out.println(sum);

		// From an array of integer elements find the largest number
		
	int[] nums= {66,77,100,88,99};
	int largest=nums[0];
	for(int e:nums) {
		if(e>largest) {
			largest=nums[e];
		}
	}System.out.println(largest);

	}

}
