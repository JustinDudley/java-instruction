import java.util.Scanner;

public class HelloWorldApp {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while(choice.equalsIgnoreCase("y")) {			
			int a = 5;
			double b = 5.5;
			System.out.println("Total is " + (a + b));
			
			String name = "Sean";
			name = name + " N ";
			name += "Blessing";
			System.out.println(name);
			
			//StringBuilder example
			StringBuilder sb = new StringBuilder("Tricia");
			sb.append(" M ");
			sb.append("Good");
			System.out.println(sb);
			
			System.out.println("Enter first name: ");
			String firstname = sc.next();
			System.out.println(firstname);
			
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			System.out.println("Age: " + age);
			
			while (age > 0 ) {
				System.out.println("age is " + age);
				age --;
			}
			
			System.out.println("Continue");
			
		}
		sc.close();
		
		
		

		// don't have to close output streams.  It closes itself.  
		// DO have to close input streams
		
		
		// this program could run from the command line
		// java has to establish an input stream and an output stream. 
		// streams are complex things in programming
		// a memory leak is "BAD"
		// Always close streams when you open them  
		// 
		
		
		
		

	}

}
