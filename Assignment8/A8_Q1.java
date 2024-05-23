// Q.1) Write a java program to create a file and write the text in it 
// and save the file.

import java.io.*;

public class A8_Q1{
    public static void main(String[] args){
        String myfile = "f1.txt";
        String text = "Hello, this is a sample text written to the file.";

        try{
            File file = new File(myfile);

            //Create a new file if it does not exist
            if(file.createNewFile()){
                System.out.println("File created: "+file.getName());
            }else{
                System.out.println("File already exists!");
            }
            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.close();

            System.out.println("Successfully wrote to the file: "+myfile);
        }catch(IOException e){
            System.out.println("An error occurred while creating or writing to the file!!");
            e.printStackTrace();
        }
    }
}