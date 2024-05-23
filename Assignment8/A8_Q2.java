// Q.2) Write a java program to read a file and display the content on screen.

import java.io.*;

public class A8_Q2{
    public static void main(String[] args){
        String myfile = "f1.txt";

        try{
            FileReader fr = new FileReader(myfile);

            //Creating a BufferedReader object to read the file
            BufferedReader br = new BufferedReader(fr);

            //Variable to hold each line read from the file
            String line;

            //Read the file line by line and print the content on screen
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();

            System.out.println("File reading completed...");
        }catch(IOException e){
            System.out.println("An error occurred while reading the file!");
            e.printStackTrace();
        }
    }
}