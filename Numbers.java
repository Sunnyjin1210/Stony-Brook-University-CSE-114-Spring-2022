//Sunny Jin, 114452827

import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter an integer: ");
	    int integer = input.nextInt();

	    System.out.print("Is 10 divisible by 5 and 6? ");
	    System.out.println((integer%5 == 0) && (integer%6 == 0));

	    System.out.print("Is 10 divisible by 5 or 6? ");
	    System.out.println((integer%5 == 0) || (integer%6 == 0));

	    System.out.print("Is 10 divisible by 5 or 6, but not both? ");

	    if(integer%5 == 0 && integer%6 != 0){
	      System.out.println(true);
	    }else if(integer%5 != 0 && integer%6 == 0){
	      System.out.println(true);
	    }else{
	      System.out.println(false);
	    }
	}

}

/*
Numbers.java: Write a program that prompts the user to enter an integer and determine whether it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run of the program:
Enter an integer: 10
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? true 
*/
