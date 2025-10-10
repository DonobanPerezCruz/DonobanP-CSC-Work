package lab3;

public abstract class Policy {
	protected String policyNumber, policyHolderName;
	protected double premiumAmount;
	
	public Policy(String policyNumber, String policyHolderName, double premiumAmount) {
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.premiumAmount = premiumAmount;
	}
	
	public void displayPolicyInfo() {
		System.out.println("Policy Number: " + policyNumber);
		System.out.println("Policy Holder: "+ policyHolderName);
		System.out.printf("Premium Amount: $%.2f\n", premiumAmount);
	}
	public abstract double computeCommission();
}
