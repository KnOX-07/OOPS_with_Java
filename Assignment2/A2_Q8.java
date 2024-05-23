// Q.8) Write a java program in which you will declare two interface sum 
// and Add inherits these interface through class A1 and display their content.

import java.util.*;

interface Sum{
    int sum(int a, int b);
}

interface Add{
    int add(int a, int b);
}

class A1 implements Sum, Add{
    public int sum(int a, int b){
        return a + b;
    }
    public int add(int a, int b){
        return a + b;
    }
    public void display(int a, int b){
        System.out.println("Sum: " +sum(a, b));
        System.out.println("Add: " +add(a, b));
    }
}

public class A2_Q8{
    public static void main(String[] args){
        // Create an instance of A1
        A1 a1 = new A1();

        int num1 = 10;
        int num2 = 12;
        
        //Display the operations using A1 instance
        a1.display(num1, num2);
    }
}