/*
Jackson Dowse
June 11th, 2020

This program accepts three inputs. One for distance, one for miles per gallon, and one for price per gallon. The cost is then given.
*/

import java.util.Scanner;

class Exercise2_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double distance = 0.0;
		double miles = 0.0;
		double price = 0.0;
		
		System.out.println("Enter the distance in miles");
		distance = input.nextDouble();
		
		System.out.println("Enter the miles per gallon");
		miles = input.nextDouble();
		
		System.out.println("Enter the price per gallon");
		price = input.nextDouble();
		
		double cost = (distance / miles) * price;
		
		System.out.println("The cost of the trip is " + cost);
	}
}