/*
Jackson Dowse
June 11th, 2020

This program converts degrees from Celsius to Fahrenheit.
*/

import java.util.Scanner;

class Exercise2_1 {
	public static void main(String[] args) {
		// Declare Variables
		Scanner input = new Scanner(System.in);
		double celsius = 0.0;
		double fahrenheit = 0.0;
		
		// Prompt User
		System.out.println("Enter a degree in Celsius:");
		celsius = input.nextDouble();
		
		// Solve
		fahrenheit = (9.0 / 5.0) * celsius + 32;
		
		// Display Results
		System.out.println("The degree in Fahrenheit is " + fahrenheit);
	}
}