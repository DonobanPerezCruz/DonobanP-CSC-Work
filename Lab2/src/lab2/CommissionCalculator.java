package lab2;

import java.util.Scanner;

public class CommissionCalculator {
	private Auto auto;
	private Home home;
	private Life life;
	
	public CommissionCalculator() {
		auto = new Auto();
		home = new Home();
		life = new Life();
	}
	public void Run() {
		Scanner input = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("-----------------------------");
			System.out.println("Welcome to Parkland Insurance");
			System.out.println("-----------------------------");
			System.out.println("1) Enter auto insurance policy information");
			System.out.println("2) Enter home insurance policy information");
			System.out.println("3) Enter life insurance policy information");
			System.out.println("4) Compute commission and print auto policy");
			System.out.println("5) Compute commission and print home policy");
			System.out.println("6) Compute commission and print life policy");
			System.out.println("7) Quit");
			
			choice = Integer.parseInt(input.nextLine());
			
			switch (choice) {
				case 1: auto.enterPolicyInfo(input); break;
				case 2: home.enterPolicyInfo(input); break;
				case 3: life.enterPolicyInfo(input); break;
				case 4: auto.printPolicy(); break;
				case 5: home.printPolicy(); break;
				case 6: life.printPolicy(); break;
				case 7: System.out.println("Thank you. Bye!"); break;
				default: System.out.println("invalid choice. Try again.");
			}
		} while (choice != 7);
		
		input.close();
				
		}
	}

