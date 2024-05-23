// Q.4) Write a Java Program to find addition of two matrices.

import java.util.*;

class A2_Q4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] matrix1 = new int[r][c];
        int[][] matrix2 = new int[r][c];
        int[][] sum = new int[r][c];

        System.out.println("Enter the elements of the 1st matrix: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the 2nd matrix: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        // Adding matrices
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The sum of the two matrices is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}