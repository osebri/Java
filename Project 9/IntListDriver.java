/** 
 @Author: Omar Sebri
 */

import java.util.Scanner;

/**
Driver to test IntList methods.
*/
public class IntListDriver{
	
	
	/**
	Creates a list, then repeatedly prints the menu and does what
	the user asks until they quit.
	*/
	public static void main(String[] args) {
		IntList list = new IntList();
		Scanner scan = new Scanner(System.in);
		
		printMenu();
		int choice = scan.nextInt();
		
		while (choice != 0) {
			int newVal;
			int oldVal;
			switch (choice) {
				case 1: //add to front
					 System.out.println("Enter integer to add to front");
					 newVal = scan.nextInt();
					 list.addToFront(newVal);
					 break;
				case 2: //remove first element
					 list.removeFirst();
					 break;
				case 3: //print
					 list.print();
					 break;
				case 4: // print length
					 System.out.println("The length of the list is: "+list.length());
					 break;
				case 5: // adds int to the end
					 System.out.println("Enter an Integr you add to end");
					 newVal=scan.nextInt();
					 list.addToend(newVal);
					 break;
				case 6: // removes the last element
					 list.removeLast();
					 break;
				case 7: // replace value with a new one
					 System.out.println("Enter the Value you want to replace");
					 oldVal=scan.nextInt();
					 String temp= scan.nextLine();
					 System.out.println("Enter the new Value");
					 newVal=scan.nextInt();
					 list.replace(oldVal, newVal);
					 break;
				case 8: // prints list in a recursive fashion
					 System.out.println("--------------------");
					 System.out.print("List elements recursively: ");
					 list.printRec();
					 System.out.println("\n-----------------------\n");
					 break;
				case 9:  // prints list backwards in a recursive fashion
					 System.out.println("--------------------");
					 System.out.print("List elements recursively Backwards: ");
					 list.printRecBackwards();
					 System.out.println("\n-----------------------\n");
					 break;
					
				default:
					System.out.println("Sorry, invalid choice");
			}
		
			printMenu();
			choice = scan.nextInt();
		}

	}

	/**
	Prints the user's choices.
	*/
	public static void printMenu() {
		System.out.println("\n Menu ");
		System.out.println(" ====");
		System.out.println("0: Quit");
		System.out.println("1: Add an integer to the front of the list");
		System.out.println("2: Remove an integer from the front of the list");
		System.out.println("3: Print the list");
		System.out.println("4: Print the length of the list");
		System.out.println("5: Add an Integer to the end of the list");
		System.out.println("6: Remove an Integer from the end of the list");
		System.out.println("7: Replace an old value with a new value");
		System.out.println("8: Print The list recursively");
		System.out.println("9: Print The list recursively backwards");
		System.out.print("\nEnter your choice: ");
	}
}
