package ch05_class_demos;

import java.util.Scanner;

public class ExceptionVsValidation {

	public static void main(String[] args) {
		System.out.println("Hello!");
		System.out.println("Enter a NUMBER: ");
		Scanner sc = new Scanner(System.in);
		
		
		// EXCEPTION HANDLING...
		int n1 = 0;   // initialize, outside try-catch block
		try {
			n1 = sc.nextInt();
		} catch (Exception e) {
			System.out.println("n1 must be a number");
			// clear remaining content in scanner
			sc.nextLine();
		}
		
		
		// ... vs. DATA VALIDATION
		System.out.println("Enter another NUMBER: ");
		int n2 = 0;
		if(sc.hasNextInt()) {	// this meth. is used for data validation
			n2 = sc.nextInt();
		}  else {
			System.out.println("n2 must be a number");
			sc.nextLine();  // get rid of any remaining input
		}
		
		sc.close();
				
		int sum = sumIt(n1, n2);
		System.out.println("Sum = " + sum);	
		System.out.println("Byte!");

	}
	
	
	//overload
	private static int sumIt(int a, int b) {
		return a + b;
	}
	
	//overload 2
	private static int sumIt(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	//overload 3
	private static int sumIt(int a, int b, int c) {
		return a + b + c;
	}
	
	

}
