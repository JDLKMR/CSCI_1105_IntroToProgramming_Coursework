/*
Jackson Dowse
June 11th, 2020

This program calculates the amount you would have saved after 6 months with an annual 5% interest rate being added.
*/

import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double value = 0.0;
		double finalvalue = 0.0;
		
		System.out.println("Enter your first month's value:");
		value = input.nextDouble();
		
		finalvalue = value * (1 + 0.05 / 12);
		finalvalue = (finalvalue + value) * (1 + 0.05 / 12);
		finalvalue = (finalvalue + value) * (1 + 0.05 / 12);
		finalvalue = (finalvalue + value) * (1 + 0.05 / 12);
		finalvalue = (finalvalue + value) * (1 + 0.05 / 12);
		finalvalue = (finalvalue + value) * (1 + 0.05 / 12);
		
		System.out.println("The value for your sixth month will be " + finalvalue);
	}
}