/*
Jackson Dowse
June 30, 2020

This program creates a matrix, the size of which being based off of the number that the user inputs
*/

import java.util.Scanner;

class Exercise6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
			int n = input.nextInt();
			printMatrix(n);
	}
	
	public static void printMatrix(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print((int)(Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}
}