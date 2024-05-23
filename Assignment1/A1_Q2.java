//Q.2) Write a program to swap two values using object reference. 
//Your program should have a swap method.

import java.util.*;

class A1_Q2{
	// Method to swap two values using object references
    static void swap(int[] a, int[] b){
        int temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int[] A = {sc.nextInt()};
        System.out.print("Enter value for b: ");
        int[] B = {sc.nextInt()};
        
        // Calling the swap method to swap the values
        swap(A, B);
        System.out.println("After swapping:-");
        System.out.println("a = " + A[0]);
        System.out.println("b = " + B[0]);
        sc.close();
    }
}