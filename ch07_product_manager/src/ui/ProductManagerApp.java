package ui;

// instead of 2 lines below, COULD just say import model.*;  [* == "wildcard".]
// if you have 3-5, or more, usually more efficient to do wildcard.
// if have 1-2, it's usually more efficient to list them one by one. 
import model.LineItem;
import model.Product;

public class ProductManagerApp {

	public static void main(String[] args) {
		
		// This is our app.  Not going to generate anything.  
		// We have to do stuff here:
		
		// --create an instance of Product
		Product p1 = new Product(".Net", "Murach's .Net Programming", 59.50);
		
		// --create an instance of LineItem
		LineItem li = new LineItem(p1, 8);
		
		// --print contents to the console 
		System.out.println(p1);
		System.out.println(li);
		
 
	}

}
