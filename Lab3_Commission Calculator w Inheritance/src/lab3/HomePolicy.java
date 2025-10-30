package lab3;

import java.util.Scanner;

public class HomePolicy extends Policy {
	private int footage;
	private double dwelling;
	private double contents;
	private double liability;
	
	public HomePolicy(String policyNumber, String policyHolderName, double premiumAmount, int footage, double dwelling, double contents, double liability) {
		super(policyNumber, policyHolderName, premiumAmount);
		this.footage = footage
		this.dwelling = dwelling;
		this.contents = contents;
		this.liability = liability;
	}
	
	 public void enterPolicyInfo(Scanner input) {
		 System.out.print("Enter policy number: ");
	     policyNumber = input.nextLine();

	     System.out.print("Enter policy holder name: ");
	     policyHolderName = input.nextLine();

	     System.out.print("Enter premium amount: ");
	        premiumAmount = Double.parseDouble(input.nextLine());

		 System.out.print("Enter house square footage: ");
        footage = Integer.parseInt(input.nextLine());

	     System.out.print("Enter dwelling coverage amount: ");
	     dwelling = Double.parseDouble(input.nextLine());

	     System.out.print("Enter contents coverage amount: ");
	     contents = Double.parseDouble(input.nextLine());
	     
	     System.out.print("Enter liability coverage amount: ");
	     liability = Double.parseDouble(input.nextLine());
	 }
	
	public void printPolicy() {
		System.out.println("home policy");
		System.out.println("-----------");
		displayPolicyInfo();
		System.out.println("Footage: " + footage);
		System.out.printf("Dwelling: $%.2f\n", dwelling);
		System.out.printf("contents: $%.2f\n", contents);
		System.out.printf("Liability: $%.2f\n", liability);
		System.out.printf("Commission: $%.2f\n", computeCommission());	
	}

	public double computeCommission() {
		return (liability * 0.30) + ((dwelling + contents) * 0.20);
	}
}


