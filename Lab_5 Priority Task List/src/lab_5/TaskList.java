package lab_5;

import java.util.ArrayList;

public class TaskList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Task> tasks = new ArrayList<>();

        // Add tasks with different priorities
        tasks.add(new Task("Attend class", 1));
        tasks.add(new Task("Homework", 2));
        tasks.add(new Task("Exercise", 3));
        tasks.add(new Task("Eat breakfast", 4));
        tasks.add(new Task("Eat lunch", 5));

        // Print the task list
        System.out.println("Priority Task List");
        System.out.println("------------------");
        for (Task task : tasks) {
        	System.out.println(task);
        }
	}
}
