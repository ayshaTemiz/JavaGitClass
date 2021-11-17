package com.syntax.class04;

import java.util.Scanner;

public class task14 {

	public static void main(String[] args) {
		// Write a program that will read three inputs of scores
		// (quiz, mid term, and final scores) and determine the grade based on the
		// following rules:
		// if the average score >=90 → grade=A
		// if the average score >= 70 and <90 → grade=B
		// if the average score>=50 and <70 → grade=C
		// if the average score<50 → grade=F

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your Math quiz");
		int quiz = scan.nextInt();
		System.out.println("Please enter your Math midTerm score");
		int midTerm = scan.nextInt();
		System.out.println("Please enter your final Math score");
		int finalGrade = scan.nextInt();

		int averageScore = (quiz + midTerm + finalGrade) / 3;

		String score;

		if (averageScore >= 90) {
			score = "A";
		} else if (averageScore >= 70 && averageScore < 90) {
			score = "B";
		} else if (averageScore >= 50 && averageScore < 70) {
			score = "C";
		} else if (averageScore < 50) {
			score = "F";
		} else {
			score = "Unknown grade";
		}

		System.out.println(" Your final score is "+score);

	}

}
