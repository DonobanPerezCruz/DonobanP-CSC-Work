package lab_7;

import java.util.Scanner;

public class CurrencyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String input;
		
		while (true) {
			System.out.print("Enter a monetary value or 'quit': ");
			input = scan.nextLine();
			
			if (input.equalsIgnoreCase("quit")) {
				break;
			}
			
			try {
				double amount = Double.parseDouble(input);
				
				if (amount < 0) {
					throw new NegativeAmountException("Cannot be a negative amount.");
				}
				
				MonetaryValue value = new MonetaryValue();
				value.convert(amount);
				System.out.println(value);
				
			} catch (Exception e) {
				System.out.println("Exception: Invalid Input");
			
			}
		}
			
		scan.close();
	}
}
			
