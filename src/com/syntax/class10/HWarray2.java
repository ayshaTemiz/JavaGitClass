package com.syntax.class10;

public class HWarray2 {

	public static void main(String[] args) {
		
		        // Retrieving all elements from 2D array
				// Create 2D array of cars : American, German, Korean, Italian.
				// Then retrieve all values from that array using 2 different loops

				String[][] cars = { 
						{ "Tesla", "Lincoln", "Chrysler" }, 
						{ "Porsche", "BMW" }, { "Cammsys" },
						{ "Ferrari", "Lamborghini" } };

		        //1st way
				for(String[] c:cars) {
					for(String printCars:c) {
						System.out.print(printCars+" ");
					}
					System.out.println();
				}
				System.out.println("----------------------------------");
				
				//2nd way
				for(int i=0;i<cars.length;i++) {
					for(int j=0;j<cars[i].length;j++) {
						System.out.print(cars[i][j]+" ");
					}
					System.out.println();
				}
	}
}
