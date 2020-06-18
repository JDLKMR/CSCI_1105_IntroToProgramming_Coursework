/*
Jackson Dowse
June 18, 2020

This program allows the user to type a value for the length of the center of a pentagon to its vertex, then proceeds to calculate the pentagon's area.
*/

import java.util.Scanner;

class Exercise4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Declare r
		double r = 0.0;
		
		//User inputs r
		System.out.println("Enter the length from the center to the vertex");
			r = input.nextDouble();
			
		//Declare and solve s based on r
		double s = 0.0;
			s = (2 * r) * (Math.sin(Math.PI / 5));
			
		//Solve area based on s and display answer
		double area = 0.0;
		area = 5 * (Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
		System.out.printf("The area of the pentagon is %.2f\n" , area);
	}
}