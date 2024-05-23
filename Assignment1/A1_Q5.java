//Q.5) Write a java program to print Factorial of a given number using recursion.

import java.util.*;

class A1_Q5
{
    static long Factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * Factorial(n - 1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        long fact = Factorial(num);
        System.out.println("Factorial of " +num+ " is: " +fact);
        sc.close();
    }
}