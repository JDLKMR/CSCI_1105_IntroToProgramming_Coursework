/*
Jackson Dowse
July 2, 2020

This program accepts a number from the user and determines whether or not it is a palindrome (a number that can be written backwards and still be the same.) Making this was hard :|
*/

import java.util.Scanner;

class Exercise6_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = 0;
		
		System.out.println("Enter a number");
		number = input.nextInt();
		boolean pal = isPalindrome(number);
		if (pal == true)
			System.out.println("This number is a palindrome");
		else
			System.out.println("This number is not a palindrome");

	}
	
	public static int reverse(int number) {
		int reverse = 0;
		
		while(number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		return reverse;
	}
	
	public static boolean isPalindrome(int number) {
		int r = reverse(number);
		
		if (number == r)
			return true;
		else
			return false;
	}
}