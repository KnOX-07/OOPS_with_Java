// Q.1) Write a Java Program to implement array of objects.

import java.util.*;

public class A2_Q1{
    static class Student{
        String name;
        int age;

        //Constructor to initialize Student object
        Student(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args){
        Student[] students={
            new Student("Alice", 20),
            new Student("Bob", 22),
            new Student("Charlie", 19)
        };
        for(int i=0; i<students.length; i++){
            Student stud = students[i];
            System.out.println("Name: " +stud.name+ ", Age: " +stud.age);
        }
    }
}