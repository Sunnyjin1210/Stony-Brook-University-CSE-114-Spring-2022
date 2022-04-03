//Sunny Jin, 114452827

import java.util.Scanner;
public class Tempature {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter a temperature between -58 Fahrenheit and 41 Fahrenheit: ");	    
	    int t_a = input.nextInt();
	    
	    System.out.print("Enter a wind speed greater than or equal to 2 then displays the wind-chill temperature: ");
	    int v = input.nextInt();

	    if((t_a < -58 || t_a > 41) || (v <= 2)){
	    	
	      System.out.println("You have went out of bounds");
	      
	    }else{
	    	
	      System.out.println("The wind-chill tempature is: " + (35.74 + 0.6215 * t_a - 35.75 * Math.pow(v,0.16) + 0.4275 * t_a * Math.pow(v,0.16)));
	      
	    }
	}

}

/*
Temperature.java: How hot is it outside? The temperature alone is not enough to provide the answer. Other factors including wind speed, relative humidity, and sunshine play important roles in determining coldness outside. In 2001, the National Weather Services (NWS) implemented the new wind-chill temperature to measure the coldness using the temperature and wind speed. The formula is t_wc=35.74 + 0.6215 * t_a - 35.75 * v^0.16 + 0.4275 * t_a * v^0.16
Where t_a  is the outside double temperature measured in degree Fahrenheit, v is the double speed measured in miles per hour, and  t_wc   is the wind-chill temperature. The formula cannot be used for windspeed below 2 mph or temperature below -58 Fahrenheit or above 41 Fahrenheit.
Write a program that prompts the user to “ Enter a temperature between -58 Fahrenheit and 41 Fahrenheit and a wind speed greater than or equal to 2 then displays the wind-chill temperature: “. Use Math.pow(a, b) to compute   v^0.16. 
Note: do not round the result.
Examples:
Enter a temperature between -58 Fahrenheit and 41 Fahrenheit and a wind speed greater than or equal to 2 then displays the wind-chill temperature: 32 10
23.72714425963738
Enter a temperature between -58 Fahrenheit and 41 Fahrenheit and a wind speed greater than or equal to 2 then displays the wind-chill temperature: 0 5
-10.509947791689996
*/