package lab2;

import java.util.Scanner;

public class Home {
	private String firstName, lastName;
	private int footage;
	private double dwelling, contents, liability;
	
	
	public void enterPolicyInfo(Scanner input) {
		System.out.print("Enter first name of insured: ");
		firstName = input.nextLine();
		System.out.print("Enter last name of insured: ");
		lastName = input.nextLine();
		System.out.print("Enter house square footage: ");
		footage = Integer.parseInt(input.nextLine());
		System.out.print("Enter amount of dwelling: ");
		dwelling = Double.parseDouble(input.nextLine());
		System.out.print("Enter amount of contents: ");
		contents = Double.parseDouble(input.nextLine());
		System.out.print("Enter amount of liability: ");
		liability = Double.parseDouble(input.nextLine());
	}
	
	public double computeCommission() {
		return 0.25 * dwelling + 0.25 * contents + 0.2 * liability;
	}
	
	public void printPolicy() {
		System.out.printf("Home Policy\n-----------\nName: %s %s\nFootage: %d\nDwelling: $%,.2f\nContents: $%,.2f\nLiability: $%,.2f\nCommission: $%,.2f\n\n",
				firstName, lastName, footage, dwelling, contents, liability, computeCommission());
		
				
		
	}
}
