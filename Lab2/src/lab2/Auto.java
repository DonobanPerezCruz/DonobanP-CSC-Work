package lab2;

import java.util.Scanner;

public class Auto {
	private String firstName, lastName, make, model;
	private double liability, collision;
	
	public void enterPolicyInfo(Scanner input) {
		System.out.print("Enter first name of insured: ");
		firstName = input.nextLine();
		System.out.print("Enter last name of insured: ");
		lastName = input.nextLine();
		System.out.print("Enter make of vehicle: ");
		make = input.nextLine();
		System.out.print("Enter model of vehicle: ");
		model = input.nextLine();
		System.out.print("enter amount of liability: ");
		liability = Double.parseDouble(input.nextLine());
		System.out.print("Enter amount of collision: ");
		collision = Double.parseDouble(input.nextLine());
	}
	
	public double computeCommission() {
		return (liability + collission) * 0.30;
	}
	
	public void printPolicy() {
		System.out.printf("Auto Policy\n------------\nName: %s  %s\nMake: %s\nModel: %s\nLiability: $%,.2f\nCollision: $%,.2f\nComission: $%,.2f\n\n",
				firstName, lastName, make, model, liability, collision, computeCommission());
	
	}
}


