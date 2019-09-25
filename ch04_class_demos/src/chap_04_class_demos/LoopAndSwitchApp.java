package chap_04_class_demos;

import java.util.Scanner;

public class LoopAndSwitchApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				//index for loop;
				// print the numbers 1 to n
				System.out.println("Enter # of times to loop: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("i = " + i);
		}
		
		// switch statement
		// convert an int day-of-week to a string day-of-week
		System.out.println("\nEnter a digit for day of week: ");
		int dow = sc.nextInt(); 		//dow = Day-Of-Week
		String dowString = "";
		
		switch (dow) {
		case 1: 
			dowString = "Monday";
			break;
		case 2:
			dowString = "Tuesday";
			break;
		// etc. !!!
		}
		
		System.out.println("\n" + dowString);
		
		sc.close();
		System.out.println("Byte!");
	}

}
