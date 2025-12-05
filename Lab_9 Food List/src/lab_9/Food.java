package lab_9;

public class Food {

	private String name;
	private String group;
	private int calories;
	private double dailyPercentage;
	Food next;
	
	public Food(String name, String group, int calories, double dailyPercentage) {
		this.name = name;
		this.group = group;
		this.calories = calories;
		this.dailyPercentage = dailyPercentage;
		this.next = null;
	}
	
	public String getName() { return name; }
	public String getGroup() { return group; }
	public int getCalories() { return calories; }
	public double getDailyPercentage() { return dailyPercentage; }
	
	public Food getNext() { return next; }
	public void setNext(Food next) { this.next = next; }
	
	@Override
	public String toString() {
		return String.format("%-20s %-15s %-10d %-15.2f",
				name, group, calories, dailyPercentage);
	}
}

