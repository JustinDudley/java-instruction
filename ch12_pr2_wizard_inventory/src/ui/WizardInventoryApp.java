package ui;

import java.util.ArrayList;
import java.util.List;

import util.Console;

public class WizardInventoryApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Wizard Inventory game!");
		
		// display the menu
		String command = Console.getString(getDisplayMenu());
		
		List<String> items = new ArrayList<>();
		items.add("Wizard Hat");
		items.add("Wand");
		items.add("Marauders Map");
		
		while (!command.equalsIgnoreCase("exit")) {
			//do biz logic!
			if (command.equalsIgnoreCase("show")) {
				// show - list all
				for (int i = 0; i< items.size(); i++) {
					int itemNbr = i + 1;
					System.out.println(itemNbr + ". " + items.get(i));
				}
			}  else if (command.equalsIgnoreCase("grab")) {
				// grab an item
				if (items.size() > 3) {
					System.out.println("Error.. cnnot add more items.  Please drop one.");
				}	else {
					// we have room for another item!
					String name = Console.getString("Name: ");
					items.add(name);
					System.out.println(name + " was added.");
				}
			}	else if (command.equalsIgnoreCase("edit")) {
				//Edit - edit an item
				int nbr = Console.getInt("Number: ");
				int idxNbr = nbr - 1;
				String updatedName - Console.getString("Updated name:");
				items.set(idxNbr,  updatedName);
			}	else if (command.equalsIgnoreCase("exit")) {
				// Drop - remove an item
				int nbr = Console.getInt("Number: ");
				// above is gobbledygook, some stmts are in the wrong if-stmt.
				//getStinrg.  Only gets up up the first string.  Console.java is only grabbing up to the first space.
				String hat = "cowboy";
				if (hat.contains("cow")) {
					System.out.println 
					
				}
				
			}
				
			
			
			
			command = Console.getString(getDisplayMenu());
		}
		
		
		
		System.out.println("Byte!");
	}

	private static String getDisplayMenu() {
		String menu = "COMMAND MENU\n" + 
				"show = Show all items/n" +
				"grab - Grab an item\n" +
				"edit = Edit an item\n" +
				"drop = Drop an item \n" +
				"exit = Exit program\n";
	
				
	"show - Show all items]n" + 
				
	
	}

}
