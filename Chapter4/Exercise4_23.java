/*
Jackson Dowse
June 19, 2020

This program accepts info for an employee's name, hourly pay, hours worked, and tax withholding rates, then prints out a payroll statement.
*/

import java.util.Scanner;

class Exercise4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Declare first variables
		String name = new String("");
		double hours;
		double payrate;
		double federaltaxrate;
		double statetaxrate;
		
		//Accept user input
		System.out.println("Enter employee's name:");
			name = input.nextLine();
		System.out.println("Enter number of hours worked:");
			hours = input.nextDouble();
		System.out.println("Enter hourly pay rate:");
			payrate = input.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
			federaltaxrate = input.nextDouble();
		System.out.println("Enter state tax withholding rate");
			statetaxrate = input.nextDouble();
			
		//Create more variables for convenience and solving math
		double grosspay = hours * payrate;
		double totaltax = federaltaxrate + statetaxrate;
		double netpay = grosspay - (grosspay * totaltax);
		double federalwithholding = federaltaxrate * grosspay;
		double statewithholding = statetaxrate * grosspay;
		double totaldeduction = federalwithholding + statewithholding;
		
		//Print out final statement
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.printf("Pay Rate: $%.2f\n" , payrate);
		System.out.printf("Gross Pay: $%.2f\n" , grosspay);
		System.out.println("Deductions:");
		System.out.printf("		Federal Withholding: $%.2f\n" , federalwithholding);
		System.out.printf("		State Withholding: $%.2f\n" , statewithholding);
		System.out.printf("		Total Deduction: $%.2f\n" , totaldeduction);
		System.out.printf("Net Pay: $%.2f\n" , netpay);
	}
}