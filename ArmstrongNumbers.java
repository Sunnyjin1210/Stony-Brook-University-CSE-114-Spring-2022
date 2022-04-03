//Sunny Jin, 114452827

import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int LowerLimit = input.nextInt();
        System.out.print("Enter the upper limit: ");
        int UpperLimit = input.nextInt();
        
        System.out.print("The Armstrong numbers between " + LowerLimit + " and " + UpperLimit + " are:");
        for(int i = LowerLimit; i <= UpperLimit; i++){
            String GettingNumber = Integer.toString(i);
            char[] number = GettingNumber.toCharArray();
            int sum = 0;

            for(int x = 0; x <  number.length; x++){
                int t = Integer.parseInt(String.valueOf(number[x]));
                sum+= Math.pow(t,number.length);
            }
            if(sum == i){
                System.out.print(" " + sum);
            }
        }
        input.close();
    }
}

/*
5. ArmstrongNumbers.java: An Armstrong number is an n-digit integer such that the sum of the n-th power of its digits is equal to the number itself. For example, 371 is an Armstrong number becase 3^3+7^3+1^3=371 (371 is a 3-digit number). 8208  is an Armstrong number because  8^4+2^4+0^4+8^4=8208 (8208 is a 4-digit number).
Write a program that asks the user for a lower limit and an upper limit and prints all the Armstrong numbers up to that limit.
Example:
Enter the lower limit: 10
Enter the upper limit: 1000
The Armstrong numbers between 10 and 1000 are: 153 370 371 407
Enter the lower limit: 8000
Enter the upper limit: 20000
The Armstrong numbers between 8000 and 20000 are: 8208 9474
Enter the lower limit: 25000
Enter the upper limit: 100000
The Armstrong numbers between 25000 and 100000 are: 54748 92727 93084
*/