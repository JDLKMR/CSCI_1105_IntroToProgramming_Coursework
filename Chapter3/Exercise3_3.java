/*
Jackson Dowse
June 16, 2020

This program uses Cramer's rule to solve an equation based on values that the user inputs for letters a-f.
*/

import java.util.Scanner;

class Exercise3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		double e = 0.0;
		double f = 0.0;
		
				
		System.out.println("Enter a");
			a = input.nextDouble();
		System.out.println("Enter b");
			b = input.nextDouble();
		System.out.println("Enter c");
			c = input.nextDouble();
		System.out.println("Enter d");
			d = input.nextDouble();
		System.out.println("Enter e");
			e = input.nextDouble();
		System.out.println("Enter f");
			f = input.nextDouble();
		
		double sum = (a * d - b * c);

		if (sum == 0) {
			System.out.println("The equation has no solution");
			System.exit(0);
		}
		
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		
		System.out.println("x is "+ x);
		System.out.println("y is "+ y);
	}
}