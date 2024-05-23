// Q.8) Write a Java Program to print Quadratic roots using command line arguments.

import java.util.*;

class A1_Q8{
    public static void main(String[] args){
        if(args.length != 3) {
            System.out.println("Usage: java A1_Q8 <a> <b> <c>");
            return;
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double determinant = b * b - 4 * a * c;

        if(determinant > 0){
            double rt1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double rt2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1 = " + rt1);
            System.out.println("Root 2 = " + rt2);
        }else if(determinant == 0)
        {
            double root = -b / (2 * a);
            System.out.println("Roots are real and same.");
            System.out.println("Root = " + root);
        }else{
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.println("Roots are complex and different.");
            System.out.println("Root 1 = " +real+ " + " +imaginary + "i");
            System.out.println("Root 2 = " +real+ " - " +imaginary+ "i");
        }
    }
}