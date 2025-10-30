package lab2;

import java.util.Scanner;

public class Life {
	private String firstName, lastName;
	private int age;
	private double term;
	
	public void enterPolicyInfo(Scanner input) {
		System.out.print("Enter first name of insured: ");
		firstName = input.nextLine();
		System.out.print("Enter last name of insured: ");
		lastName = input.nextLine();
		System.out.print("Enter age of insured: ");
		age = Integer.parseInt(input.nextLine());
		System.out.print("Enter amount of term: ");
		term = Double.parseDouble(input.nextLine());
	}
	
	public double computeCommission() {
		return term * 0.20;
	}
	
	public void printPolicy() {
		System.out.printf("Life Policy\n-----------\nName: %s %s\nAge: %d\nTerm: $%,.2f\nCommission: $%,.2f\n\n",
				firstName, lastName, age, term, computeCommission());
	}
}

