//Q.3) Write java program to print Biggest of 3 Numbers using Logical Operators.

import java.util.*;

class A1_Q3
{
    public static void main(String args[]){
        int a, b, c, biggest, temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        c = sc.nextInt();

    //We will compare the value of a and b
    temp = a>b?a:b;

    //Now we will compare temp with c and store the variable
    biggest = c>temp?c:temp;

    System.out.println("The Biggest number is: "+biggest);
    }
}