// Q.13) Write a JAVA Program to demonstrate Dynamic method dispatch.

import java.util.*;

//Base class
class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
//Derived class
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
//Derived class 
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
//Derived class Cow
class Cow extends Animal{
    void sound(){
        System.out.println("Cow moos");
    }
}
public class A2_Q13{
    public static void main(String[] args){
        //Reference of type Animal but object of type Dog
        Animal a1 = new Dog();
        a1.sound();

        a1 = new Cat();
        a1.sound();

        a1 = new Cow();
        a1.sound();
    }
}