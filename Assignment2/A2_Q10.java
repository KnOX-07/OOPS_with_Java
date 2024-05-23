// Q.10) Write a Java program that creates a Class, namely Student.
// i) Ensure that Age instance variable of the Class is never accessed directly, 
//and its value is never less than 4 and greater than 40 for any Object 
//of the Class(use methods to validate and assign the value).
// ii) Ensure that the constructor always assigns a unique value to 
//Enrollment_No instance variable for every Object of the 
//Class(use a static class variable for counting objects, say Object_Counter).
// iii) Ensure that when an Object is removed, the Object_Counter is automatically 
//decremented (use finalize()), and whenever required the variable can only be accessed 
//using a method even without an Object reference (make the
//counter private and use a static method to access it).

import java.util.*;

//Define class Student(A2_Q10)
public class A2_Q10{
    private int age;
    private final int enrollmentNo;
    private static int objectCounter = 0;
    private static int uniqueIdCounter = 1000; //Assigning unique enrollment numbers

    public A2_Q10(int age){
        setAge(age);
        enrollmentNo = ++uniqueIdCounter;
        inObjectCounter();
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age < 4 || age > 40){
            throw new IllegalArgumentException("Age must be between 4 and 40.");
        }
        this.age = age;
    }

    public int getEnrollmentNo(){
        return enrollmentNo;
    }

    //Get the current object counter
    public static int getObjectCounter(){
        return objectCounter;
    }

    //Increment object counter
    private static void inObjectCounter(){
        objectCounter++;
    }

    //Decrement the object counter
    private static void deObjectCounter(){
        objectCounter--;
    }

    //Destructor-like cleanup method to avoid warning(when finalize() is not used)
    /*public void cleanup() {
        deObjectCounter();
    }*/

    //Use finalize() method to cleanup the code
    protected void finalize() throws Throwable{
        try{
            deObjectCounter();
        }finally{
            super.finalize();
        }
    }

    public static void main(String[] args){
        //Creating student objects
        A2_Q10 stud1 = new A2_Q10(10);
        A2_Q10 stud2 = new A2_Q10(20);

        System.out.println("Student 1 Enrollment No: " + stud1.getEnrollmentNo());
        System.out.println("Student 2 Enrollment No: " + stud2.getEnrollmentNo());
        System.out.println("Current Object Counter: " + A2_Q10.getObjectCounter());

        //Throw an IllegalArgumentException
        //Student stud3 = new Student(50);

        //To run garbage collector
        stud1 = null;
        System.gc(); //Requesting garbage collection from JVM
        //Adding a sleep to ensure finalize is called before main ends
        try{
            Thread.sleep(1000); 
        }catch(InterruptedException e){e.printStackTrace();}

        //Explicitly calling cleanup method
        //stud2.cleanup();

        System.out.println("Object Counter after GC: " +A2_Q10.getObjectCounter());
    }
}