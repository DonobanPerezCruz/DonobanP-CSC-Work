package lab_6;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Gradebook gradebook = new Gradebook();
		
		for(int i = 0; i < 5; i++) {
			gradebook.addStudents(input);
		}
		
		gradebook.sortStudents();
		gradebook.printStudents();
		}

	}
