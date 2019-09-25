package ch05_class_demos;

import java.util.Scanner;

public class DataValidation {
		
	
	public static double getAcceptableDouble(Scanner sc, String prompt) {
		double length = 0;
		boolean noDubYet = true; 
		while (noDubYet) {
			System.out.println(prompt);
			if (sc.hasNextDouble()) {
				length = sc.nextDouble();
				if (length <= 0) {
					System.out.println("Error!  Your number must be greater than 0.");
				} else if (length >= 1000000) {
					System.out.println("Error!  Your number must be less than 1,000,000.");
				} else {
					noDubYet = false;
				}
			} else {
				System.out.println("Error! You must enter a number");
				sc.nextLine();  // CLEARS OUT BAD INFO
			}
		}
		return length;
	}
	

	public static void main(String[] args) {
		System.out.println("Hi!");
		System.out.println("Welcome to the Area and Perimeter Calculator");
		Scanner sc = new Scanner(System.in);
		
		double length = getAcceptableDouble(sc, "Enter a length: ");
		System.out.println("Your length: " + length);
			
		sc.close();
		System.out.println("Byte!");
		
	}
}
