/*
Jackson Dowse
June 25, 2020

This program accepts a string from the user, then tells you how many vowels and how many consonants it has.
*/

import java.util.Scanner;

class Exercise5_49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String string;
		
		System.out.println("Enter a string");
			string = input.nextLine();
			
		int vowels = 0;
		int consonants = 0;
		
		string = string.toLowerCase();
		
		for(int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
				vowels++;
			}
		else if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
			consonants++;
			}
		}
		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + consonants);
	}
}