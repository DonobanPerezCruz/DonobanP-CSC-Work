package lab_9;

import java.util.Random;

public class FoodList {
	private Food head;
	
	public FoodList() {
		head = null;
	}
	
	public void add(Food food) {
		if (head == null) {
			head = food;
		} else {
			Food current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(food);
		}
	}
	
	public void listFoods() {
		System.out.println("==================================================================");
		System.out.printf("%-20s %-15s %-10s %-15s\n",
				"Name", "Food Group", "Calories", "Daily Percentage");
		System.out.println("==================================================================");
		Food current = head;
		while (current != null) {
			System.out.println(current);
			current = current.getNext();
		}
	}
	
	public Food findFood(String name) {
		Food current = head;
		while (current!= null) {
			if (current.getName().equalsIgnoreCase(name)) return current;
			current = current.getNext();
		}
		return null;
	}
		
	public Food[] randomMeal() {
		int size = size();
		Food[] meal = new Food[3];
		Random random = new Random();
		for (int i = 0; i < 3; i++) {
			meal[i] = get(random.nextInt(size));
		}
		return meal;
	}
	
	public void removeHighCalorie(int limit) {
		while (head != null && head.getCalories() > limit) {
			head = head.getNext();
		}
		
		Food current = head;
		while (current != null && current.getNext() != null) {
			if(current.getNext().getCalories() > limit) {
				current.setNext(current.getNext().getNext());
			} else {
				current = current.getNext();
			}
		}
	}
		
		public int size() {
			int count = 0;
			Food current = head;
			while (current != null) {
				count++;
				current = current.getNext();
			}
			return count;
		}
		
		public Food get(int index) {
			int count = 0;
			Food current = head;
			while (current != null) {
				if (count == index) return current;
				current = current.getNext();
				count++;
			}
			return null;
		}
	}
