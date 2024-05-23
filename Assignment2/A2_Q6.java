// Q.6) WAP using parameterized constructor with two parameters id and name. 
// While creating the objects obj1 and obj2 passed two arguments so that 
// this constructor gets invoked after creation of obj1 and obj2.

import java.util.*;

public class A2_Q6{
    private int id;
    private String name;

    // Parameterized constructor
    public A2_Q6(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args){
        A2_Q6 obj1 = new A2_Q6(101, "Alice");
        A2_Q6 obj2 = new A2_Q6(102, "Bob");

        System.out.println("Details of obj1:");
        obj1.display();
        System.out.println("Details of obj2:");
        obj2.display();
    }
}