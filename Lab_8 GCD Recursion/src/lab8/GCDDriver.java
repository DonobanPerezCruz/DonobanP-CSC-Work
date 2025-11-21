package lab8;

import java.util.Scanner;

public class GCDDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter positive integer as numerator: ");
	        int numerator = scanner.nextInt();

	        System.out.print("Enter positive integer as denominator: ");
	        int denominator = scanner.nextInt();

	        RationalNumber rational = new RationalNumber(numerator, denominator);
	        int gcd = rational.getGCD();

	        System.out.println("Greatest common denominator of " + rational + " is " + gcd);
	        
	        scanner.close();
	}

}
