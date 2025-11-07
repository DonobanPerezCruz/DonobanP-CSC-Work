package lab_7;

public class MonetaryValue {
	private int tens, fives, ones, quarters, dimes, nickels, pennies;
	
	public void convert(double amount) {
		
		int totalCents = (int) Math.round(amount * 100);
		
		tens = totalCents / 1000; totalCents %= 1000;
		fives = totalCents / 500; totalCents %= 500;
		ones = totalCents / 100; totalCents %= 100;
		quarters = totalCents / 25; totalCents %= 25;
		dimes = totalCents / 10; totalCents %= 10;
		nickels = totalCents / 5; totalCents %= 5;
		pennies = totalCents;
	}
		@Override
		public String toString() {
			return tens + " ten dollar bills\n" +
					fives + " five dollar bills\n" +
					ones + " one dollar bills\n" +
					quarters + " quarters\n" +
					dimes + " dimes\n" +
					nickels + " nickels\n" +
					pennies + " pennies";
		}
}
