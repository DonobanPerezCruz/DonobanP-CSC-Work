package lab_6;

public class Student implements Comparable<Student>  {
	private String firstName, lastName;
	private int score;
	
	public Student(String firstName, String lastName, int score) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
	
	public String toString() {
		return firstName + " " + lastName + " " + score;
	}
	@Override
	public int compareTo(Student other) {
		return Integer.compare(other.score, this.score);
	}
}
