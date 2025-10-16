package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class CommissionCalculator {
	private ArrayList<Policy> policies;
	
	public CommissionCalculator() {
		policies = new ArrayList<>();
	}
	
	public void run() {
		Scanner input = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("-----------------------------");
			System.out.println("Welcome to Parkland Insurance");
			System.out.println("-----------------------------");
			System.out.println("Enter any of the following:");
			System.out.println("1) Enter auto insurance policy information");
			System.out.println("2) Enter home insurance policy information");
			System.out.println("3) Enter life insurance policy information");
			System.out.println("4) Print all sales entered");
			System.out.println("5) Quit");
			System.out.print("choice: ");
			
			choice = Integer.parseInt(input.nextLine());
			
			switch (choice) {
			case 1:
				AutoPolicy auto = new AutoPolicy("", "", 0.0, 0.0, 0.0);
				auto.enterPolicyInfo(input);
				policies.add(auto);
				break;
			case 2:
				HomePolicy home = new HomePolicy("", "", 0.0, 0.0, 0.0, 0.0);
				home.enterPolicyInfo(input);
				policies.add(home);
				break;
			case 3:
				LifePolicy life = new LifePolicy("", "", 0.0, 0, 0.0);
				life.enterPolicyInfo(input);
				policies.add(life);
				break;
			case 4:
				for (Policy policy : policies) {
					policy.computeCommission();
					System.out.println(policy);
					System.out.println("-----------------------------");
				}
				break;
			case 5: System.out.println("Thank you. Bye!"); break;
			default: System.out.println("invalid choice. Try again.");
			}
		} while (choice != 5);
		
		input.close();
	}
}
			