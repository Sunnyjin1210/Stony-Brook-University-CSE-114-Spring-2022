//Sunny Jin 114452827

import java.util.Scanner;
public class MultiplyMatrices{

    public static double[][] multiplyMatrices(double[][] a, double[][] b) {

        double[][] c = new double[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int n = 0; n < a[0].length; n++) {
                    c[i][j] += a[i][n] * b[n][j];
                }

            }
        }

        return c;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of rows for the first matrix (please input the matrix with the least rows if they are not of equal length): ");
        int rows1 = input.nextInt();
        System.out.print("Enter the amount of columns for the first matrix: ");
        int columns1 = input.nextInt();
        double[][] matrix1 = new double[rows1][columns1];
        System.out.println("Enter the matrix of " + rows1 + " x " + columns1 + ": ");
        for(int i = 0; i < rows1; i++){
            for(int x = 0; x < columns1; x++){
                matrix1[i][x] = input.nextDouble();
            }
        }

        System.out.print("Enter the amount of rows for the second matrix: ");
        int rows2 = input.nextInt();
        System.out.print("Enter the amount of columns for the second matrix: ");
        int columns2 = input.nextInt();
        double[][] matrix2 = new double[rows2][columns2];
        System.out.println("Enter the matrix of " + rows2 + " x " + columns2 + ": ");
        for(int i = 0; i < rows2; i++){
            for(int x = 0; x < columns2; x++){
                matrix2[i][x] = input.nextDouble();
            }
        }
        input.close();


        double[][] productMatrix = multiplyMatrices(matrix1, matrix2);

        System.out.println("The product of the two matrices is: ");
        for(int i = 0; i < productMatrix.length; i++){
            for(int j = 0; j < productMatrix[i].length; j++){
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}


/*
1. (15 points) MultiplyMatrices.java: Multiplying two matrices. Write a method multiplyMatrices to multiply two matrices. The header of the method is as follows:
public static double[][] multiplyMatrices(double[][] a, double[][] b)

To multiply matrix a by matrix b, the number of js in a must be the same as the number of is in b, and the two matrices must have elements of the same or compatible types. Let c be the result of the multiplication. Each element cij is ai1 x b1j + ai2 x b2j + … + ain x bnj.
Write a test program that prompts the user to enter two 3 x 3 matrices and displays their product.
Example: multiplyMatrices(new double[][]{{1,2,3},{4,5,6}}, double[][]{{10,11},{20,21},{30,31}}) should return {{140.0,146.0 },{320.0 ,335.0 }} because



1 2 3 
4 5 6

10 11
20 21
30 31


*/