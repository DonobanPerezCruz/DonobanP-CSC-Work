package lab3;

import java.util.Scanner;

public class AutoPolicy extends Policy {
	private double liability;
	private double collision;
	
	public AutoPolicy(String policyNumber, String policyHolderName, double premiumAmount, double liability, double collision) {
		super(policyNumber, policyHolderName, premiumAmount);
		this.liability = liability;
		this.collision = collision;
	}
	
	public void enterPolicyInfo(Scanner input) {
		System.out.print("Enter policy number: ");
		policyNumber = input.nextLine();
		
		System.out.print("Enter policy holder Name: ");
		policyHolderName = input.nextLine();
		
		System.out.print("Enter premium amount: ");
		premiumAmount = Double.parseDouble(input.nextLine());
		
		System.out.print("Enter liability coverage amount: ");
		liability =  Double.parseDouble(input.nextLine());
		
		System.out.print("enter collision coverage: ");
		collision = Double.parseDouble(input.nextLine());
		
	}
	
	public void printPolicy() {
		System.out.println("Auto policy");
		System.out.println("-----------");
		displayPolicyInfo();
		System.out.printf("Liability: $%.2f\n", liability);
		System.out.printf("Collision: $%.2f\n", collision);
		System.out.printf("Commission: $%.2f\n", computeCommission());
	}
	
	public double computeCommission() {
		return 0.24 * liability + 0.6 * collision;
	}
}

