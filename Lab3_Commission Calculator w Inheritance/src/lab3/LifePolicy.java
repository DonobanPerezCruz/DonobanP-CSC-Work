package lab3;

import java.util.Scanner;

public class LifePolicy extends Policy {
	private int age;
	private double term;
	
	public LifePolicy(String policyNumber, String policyHolderName, double premiumAmount, int age, double term) {
		super(policyNumber, policyHolderName, premiumAmount);
		this.age = age;
		this.term = term;
	}
	public void enterPolicyInfo(Scanner input) {
        System.out.print("Enter policy number: ");
        policyNumber = input.nextLine();

        System.out.print("Enter policy holder name: ");
        policyHolderName = input.nextLine();

        System.out.print("Enter premium amount: ");
        premiumAmount = Double.parseDouble(input.nextLine());

        System.out.print("Enter age of policy holder: ");
        age = Integer.parseInt(input.nextLine());

        System.out.print("Enter term length: ");
        term = Double.parseDouble(input.nextLine());
	}
	
	public void printPolicy() {
		displayPolicyInfo();
		System.out.println("Age: " + age);
		System.out.printf("Term: $%.2f\n", term);
		System.out.printf("Commission: $%.2f\n", computeCommission());
	}
	
	public double computeCommission() {
		return term * 0.20;
	}

}

