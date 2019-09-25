package OneTwoThree;

import java.util.Scanner;

// 2-1
public class StudentRegistration {

	public static void main(String[] args) {
		System.out.println("Student Registration Form \n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String firstname = sc.next();
		
		System.out.print("Enter last name: ");
		String lastname = sc.next();
		
		System.out.print("Enter year of birth: ");
		int birth = sc.nextInt();
		
		System.out.println("\nWelcome " + firstname + " " + lastname);
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + firstname + "*" + Integer.toString(birth) );
		
		sc.close();
	}
}
/*
Student Registration Form

Enter fist name:  Harold
Enter last name:   Moore
Enter year of birth:  1998

Welcome Harold Moore!
Your registration is complete.
Your temporary password is: Harold*1998
*/