package lab_9;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MealDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodList foodlist = new FoodList();
		
		try (Scanner scan = new Scanner(new File("foods.txt"))) {
			while (scan.hasNext()) {
				String name = scan.next();
				String group = scan.next();
				int calories = scan.nextInt();
				double percent = scan.nextDouble();
				foodlist.add(new Food(name, group, calories, percent));
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
			return;
		}
		
		Scanner input = new Scanner(System.in);
		int choice;
		do {
			System.out.println("---------------------------------\n");
			System.out.println("Welcome to Parkland Meal Selector\n");
			System.out.println("---------------------------------\n");
			System.out.println("Please select from the following:\n");
            System.out.println("1 - List food database");
            System.out.println("2 - Create meal by manual selection");
            System.out.println("3 - Create meal by random selection");
            System.out.println("4 - Remove foods high in calorie");
            System.out.println("5 - Exit");
            System.out.println();
            choice = input.nextInt();
            input.nextLine();
            
            switch (choice) {
            case 1:
            	System.out.println();
            	foodlist.listFoods();
            	break;
            case 2:
            	Food[] meal = new Food[3];
            	int count = 0;
            	while (count < 3) {
            		System.out.print("Enter food name: ");
            		String name = input.nextLine();
            		Food f = foodlist.findFood(name);
            		if (f != null) {
            			meal[count++] = f;
            		} else {
            			System.out.println("Food " + name + " not in database, try again");
            		}
            	}
            	printMeal(meal);
            	break;
            case 3:
            	Food[] randomMeal = foodlist.randomMeal();
            	printMeal(randomMeal);
            	break;
            case 4:
            	System.out.print("Enter calorie limit: ");
            	int limit = input.nextInt();
            	foodlist.removeHighCalorie(limit);
            	break;
            }
		} while (choice != 5);
		
		input.close();
	}
	
	private static void printMeal(Food[] meal) {
        int totalCalories = 0;
        double totalPercent = 0;
        System.out.println("\n===============================");
        System.out.print("Your selected meal\nFoods: ");
        for (Food f : meal) {
            System.out.print(f.getName() + " ");
            totalCalories += f.getCalories();
            totalPercent += f.getDailyPercentage();
        }
        System.out.println("\nTotal calorie count: " + totalCalories);
        System.out.println("Total daily percentage: " + (int)(totalPercent * 100) + "%");
        System.out.println("===============================");
    }
}  	
