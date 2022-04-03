//Sunny Jin, 114452827

import java.util.Scanner;
public class Interests{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of years: ");
        int numberOfYears = input.nextInt();

        System.out.println("Interest Rate      Monthly Payment        Total Payment");
        
        for(double i = 5; i <= 8; i+= 0.125){
            double monthlyInterestRate = i / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
            double totalPayment = monthlyPayment * numberOfYears * 12;
            monthlyPayment = Math.round(monthlyPayment * 100.0)/100.0;
            totalPayment = (Math.round(totalPayment * 100.0)/100.0);     
            System.out.println(i + "%                  " + monthlyPayment + "                  " + totalPayment);
       
        }
        input.close();
    }
}

/*
2. Interests.java: (Financial application: comparing loans with various interest rates) Write a program that lets the user enter the double loan amount and loan period in number of years (int) and displays the monthly and total payments for each interest rate starting from 5% to 8%, with an increment of 1/8.
Loan amount: 10000.00
Number of years: 5
Interest Rate      Monthly Payment             Total Payment
5%                 188.71                      11322.74
5.125%             189.28                      11357.13
5.25%              189.85                      11391.59
...
7.85%              202.16                      12129.97
8.0%               202.76                      12165.83
double monthlyInterestRate = annualInterestRate / 1200;
double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
double totalPayment = monthlyPayment * numberOfYears * 12; 
*/