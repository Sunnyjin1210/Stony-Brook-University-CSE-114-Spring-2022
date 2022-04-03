//Sunny Jin, 114452827

import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Side 1: ");
	    int side1 = input.nextInt();

	    System.out.print("Side 2: ");
	    int side2 = input.nextInt();

	    System.out.print("Side 3: ");
	    int side3 = input.nextInt();

	    if (side1 == side2 && side1 == side3) {
	    	System.out.println("Equilateral Triangle");
	    }else if(side1 != side2 && side1 != side3 && side2 != side3) {
	    	System.out.println("Scalene Triangle");
	    }else if((side1 == side2 && side1 != side3 && (side1 + side2) >= side3) || 
	    		(side1 == side3 && side1 != side2 && (side1 + side3) >= side2) || 
	    		(side2 == side3 && side2 != side1 && (side2 + side3) >= side1)){
	    	System.out.println("Isosceles Triangle");
	    }else {
	    	System.out.println("Invalid Input!");
	    }
	    
	}

}

/*
Triangle.java: Write a program that reads three double edges (sides) for a triangle and classify it as Equilateral (i.e., all sides are equal), Scalene (all sides are different), Isosceles (only 2 sides are equal) if the input is valid. The input is valid if the sum of every pair of two edges is greater than the remaining edge. You may assume that the user inputs a positive value for the edges.
Here are 4 sample runs:
Side1: 3
Side2: 3
Side3: 9
Output: Invalid input!
Side1: 3
Side2: 3
Side3: 3
Output: Equilateral
 
Side1: 10
Side2: 10
Side3: 1
        Output: Isosceles
Side1: 3
Side2: 4
Side3: 5
      Output: Scalene
This assignment is worth 40 points (10 points per program).
*/