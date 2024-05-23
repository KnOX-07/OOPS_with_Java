// Q.1) Write a program to implement the concept of Exception Handling 
// using predefined exception.

import java.io.*;

public class A7_Q1{
    public static void main(String[] args){
        System.out.println("Dividing Numbers:-");
        divideNum(10, 2);
        divideNum(10, 0);
        divideNum(10, "x");

        System.out.println("\nReading from a file:-");
        readFile("f1.txt");
        readFile("f2.txt"); //This file does not exist
    }
    public static void divideNum(int a, Object b){
        try{
            //Type casting b to an integer and perform division
            int divisor = (int)b;
            int result = a/divisor;
            System.out.println("The result of " +a+ "/" +divisor+ " is: " +result);
        }catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }catch(ClassCastException e){
            System.out.println("Error: Invalid input type! Both arguments must be integers.");
        }catch(Exception e){
            System.out.println("An unexpected error occurred: " +e.getMessage());
        }
    }
    public static void readFile(String filePath){
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Error: An I/O error occurred while reading the file: " +e.getMessage());
        }catch(Exception e){
            System.out.println("An unexpected error occurred: " +e.getMessage());
        }finally{
            //Ensure the reader is closed properly
            try{
                if(reader != null){
                    reader.close();
                }
            }catch(IOException e){
                System.out.println("Error: Failed to close the file reader: " +e.getMessage());
            }
        }
    }
}