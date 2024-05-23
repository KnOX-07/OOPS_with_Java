//Q.1) Write a Java program that calculates factorial of a number.

import java.util.*;

class A1_Q1
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
	
	int i, fact=1;
    //int num = 5;

    for(i=1;i<=num;i++){
    fact = fact*i;
    }
	System.out.print("Factorial of " +num+ " is: " +fact);
    }
}