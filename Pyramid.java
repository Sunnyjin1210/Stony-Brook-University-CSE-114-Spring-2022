//Sunny Jin, 114452827

import java.util.Scanner;
public class Pyramid {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of lines: ");
    int lines = input.nextInt();

    for(int rows = 1; rows <= lines; rows++){
      //Spaces
      for(int spaces = 1; spaces <= (lines - rows); spaces++){
        System.out.print("   ");
      }
      //Printing in Ascending order
      for(int ascending = 0; ascending < rows; ascending++){
        System.out.printf("%4d", (int)Math.pow(2,ascending));
      }

      //Printing for Decesnding order
      for(int Decesnding = rows - 2; Decesnding >= 0; Decesnding--){
        System.out.printf("%4d", (int)Math.pow(2, Decesnding));
      }
      System.out.println();
    }
    input.close();
  }
}