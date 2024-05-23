// Q.7) Write a program in java to generate an abstract class A also class B inherits 
// the class A. Generate the object for class B and display the text "call me from B".

import java.util.*;

abstract class A{
    //Abstract method that must be implemented by subclasses
    abstract void display();
}
class B extends A{
    void display(){
        System.out.println("call me from B");
    }
}
public class A2_Q7{
    public static void main(String[] args){
        B obj = new B();
        obj.display();
    }
}