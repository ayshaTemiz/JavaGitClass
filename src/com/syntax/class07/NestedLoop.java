package com.syntax.class07;

public class NestedLoop {

	public static void main(String[] args) {

		for (int i = 7; i > 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int a = 1; a <= 7; a++) {
			for (int b =1; b < a; b++) {
				System.out.print(b + " ");
			}
			System.out.println();

		}

	}
}
