package lab4;

import java.util.Scanner;

public class HomePolicy extends Policy {
	private int footage;
	private double dwelling;
	private double contents;
	private double liability;
	
	public HomePolicy(String policyNumber, String policyHolderName, int footage, double premiumAmount, double dwelling, double contents, double liability) {
		super(policyNumber, policyHolderName, premiumAmount);
		this.footage = footage;
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
	 public String toString() {
			return "home policy\n-----------\n" + 
					"Policy Number: " + policyNumber + "\n" +
					"Policy Holder: " + policyHolderName + "\n" +
					String.format("Premium Amount: $%.2f\n", premiumAmount) +
					"Footage: " + footage + "\n" +
					String.format("Dwelling: $%.2f\n",  dwelling) +
					String.format("Contents: $%.2f\n", contents) +
					String.format("Liability: $%.2f\n", liability) +
		            String.format("Commission: $%.2f\n", computeCommission());
	 }
	
	public double computeCommission() {
		return (liability * 0.30) + ((dwelling + contents) * 0.20);
	}
}



