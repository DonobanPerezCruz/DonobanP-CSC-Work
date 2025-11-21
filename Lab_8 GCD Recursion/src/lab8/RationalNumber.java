package lab8;

public class RationalNumber {
	private int numerator;
	private int denominator;
	
	public RationalNumber( int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int gcd(int num1, int num2)
	{
		int result;
		
		if (num1 == num2)
			result = num1;
		else {
			if (num1 > num2)
				result = gcd(num1 - num2, num2);
			else
				result = gcd(num1, num2 - num1);
		}
		
		return result;
	}
		public int getGCD() {
			return gcd(numerator, denominator);
		}
		
		public String toString() {
			return numerator + "/" + denominator;	
	}

}
