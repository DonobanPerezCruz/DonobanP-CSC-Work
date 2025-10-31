package lab_6;

import java.util.Scanner;

public class Gradebook {
	private Student[] students;
	private int count;
	
	public Gradebook() {
		students = new Student[5];
		count = 0;
	}
	
	public void addStudents(Scanner input) {
		System.out.print("Enter student <firstName> <lastName> <score>: ");
		
		String first = input.next();
		
		String last = input.next();
		
		int score = input.nextInt();
		
		if (count < students.length) {
		    students[count] = new Student(first, last, score);
		    count++;
		}
	}
		
	public void sortStudents() {
		Sorting.selectionSort(students);
	}
	
	public void printStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
	}
}
