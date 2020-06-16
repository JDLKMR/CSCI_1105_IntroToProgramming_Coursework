/*
Jackson Dowse
June 16, 2020

This program takes user input to define three sides of a triange, then calculates if it's a valid triangle, and displays the perimeter of it.
*/

import java.util.Scanner;

class Exercise3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sidea = 0;
		int sideb = 0;
		int sidec = 0;
		
		System.out.println("Enter side a");
			sidea = input.nextInt();
		System.out.println("Enter side b");
			sideb = input.nextInt();
		System.out.println("Enter side c");
			sidec = input.nextInt();
			
		if (sidea + sideb > sidec && sideb + sidec > sidea && sidea + sidec > sideb) {
			int perimeter = sidea + sideb + sidec;
			System.out.println("The perimeter of the triangle is " + perimeter);
		}
		else {
			System.out.println("Invalid triangle");
		}
	}
}