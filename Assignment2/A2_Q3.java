// Q.3) Write a Java Program to find the largest and smallest element from an array.

import java.util.*;

class A2_Q3
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]<smallest)
                smallest = arr[i];
            if(arr[i]>largest)
                largest = arr[i];
        }
        System.out.println("Largest element: "+largest);
        System.out.println("Smallest element: "+smallest);
        sc.close();
    }
}