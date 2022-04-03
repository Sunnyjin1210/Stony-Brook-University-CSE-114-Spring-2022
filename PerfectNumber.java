//Sunny Jin, 114452827

import java.util.Scanner;
public class PerfectNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the upper limit ");
		int UpperLimit = input.nextInt();

		System.out.print(" The perfect numbers below " + UpperLimit + " are:");
		for(int i = 1; i <= UpperLimit; i++){
			
			int sum = 0;
			for(int x = 1; x < i; x++ ){
				if(i % x == 0){
					sum += x;
				}  
		}

		if(sum == i){
			System.out.print(" " + sum);
		}

		input.close();
	}
}
}

/*
4. PerfectNumber.java: A positive integer is called a perfect number if it is equal to the sum of all of its positive divisors, excluding itself. For example, 6 is the first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 +1. Write a program that asks the user for an upper limit and prints all the perfect numbers up to that limit.
Example:
Enter the upper limit: 10000
The perfect numbers below 10000 are: 6 28 496 8128.
*/