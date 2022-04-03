//Sunny Jin, 114452827

import java.util.Scanner;
public class Eggs {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("The number of eggs in the order is: ");
	    int eggs = input.nextInt();

	    int DozenEggs = eggs/12;
	    int LooseEggs = eggs%12;
	    double Total = ((eggs/12)*3.25) + ((eggs%12)*0.45);

	    System.out.println("You ordered " + eggs + " eggs");
	    System.out.println("That's " + DozenEggs +  " dozen at $3.25 per dozen and " + LooseEggs + " loose eggs at 45 cents for a total of $" + Total);
	}

}

/*
Eggs.java: Stony Brook Dairy Farm sells organic brown eggs to local customers. It charges $3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen. Write a program that prompts a user for “The number of eggs in the order (integer): “ and then display the amount owed with a full explanation. For example, if the input is 27, the output is:
You ordered 27 eggs.  That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents for a total of $7.85.
Note: do not round the result. Just print what Java gives you as a double result.
*/