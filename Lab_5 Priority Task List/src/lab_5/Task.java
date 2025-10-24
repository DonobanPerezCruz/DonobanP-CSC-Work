package lab_5;

public class Task implements Priority {
	private String activity;
	private int priority;
	
	public Task(String activity, int priority) {
		this.activity = activity;
		setPriority(priority);
	}
	@Override
    public void setPriority(int value) {
        if (value >= 1 && value <= 5) {
            priority = value;
        } else {
            System.out.println("Invalid priority value. Must be 1–5.");
        }
    }
	 @Override
	    public int getPriority() {
	        return priority;
	    }

	    public String toString() {
	        return String.format("%-20s priority: %d", activity, priority);
	    }
	}
