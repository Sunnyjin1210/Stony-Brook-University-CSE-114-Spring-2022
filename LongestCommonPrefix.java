//Sunny Jin, 114452827

import java.util.Scanner;
public class LongestCommonPrefix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = input.nextLine();
        System.out.print("Enter the second string: ");
        String second = input.nextLine();

        int index = 0;
        String prefix = "";
        while(first.charAt(index) == second.charAt(index)){
            prefix += first.charAt(index);
            index++;
        }

/*
        if(index > 0){
            System.out.println("The common prefix is " + prefix);
        }else{
            System.out.print(first + " and " + second + " have no common prefix");
        }
        input.close();
 */
   System.out.print(-10/-1);     
    }
}
/*3. LongestCommonPrefix.java: Write a program that prompts the user to enter two strings and display the largest common prefix of the two strings. If there are no common prefix between the two entered string display a message which tells the user that the two string doesn’t have a common prefix.
Examples:
Enter the first string: Atlanta
Enter the second string: Macon
Atlanta and Macon have no common prefix.
Enter the first string: Welcome to Java
Enter the second string: Welcome to programming
The common prefix is: Welcome to 
Note: The prefix actually includes the space after ‘to’ as well
Enter the first string: I love coffee
Enter the second string: I love Java
The common prefix is I love 
*/