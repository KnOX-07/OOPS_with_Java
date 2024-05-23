/* Q.11) Write a Java program that creates a Class namely A that has a private 
instance variable and method, a protected instance variable and method, 
a default instance variable and method, and a public instance variable and method. 
Create another Class say B that inherits from A.
i. Show that all except private members are inherited.
ii. Show that an inherited instance variable can be shadowed 
(with the same or weaker access visibility) but can't be accessed using super keyword 
in the sub-class.
iii. Show that the reference variable of type A or B can't access an overridden method 
of A in the Object of B. */

import java.util.*;

class A{
    private int Var1;
    protected int Var2;
    int Var3; //default variable
    public int Var4;

    private void myMethod1(){
        System.out.println("A's private method");
    }
    protected void myMethod2(){
        System.out.println("A's protected method");
    }
    void myMethod3() {
        System.out.println("A's default method");
    }
    public void myMethod4(){
        System.out.println("A's public method");
    }
}
class B extends A{
    //private int Var1; // Shadowing private variable
    //Can't be accessed using super keyword if shadowed
    //protected int Var2; //Shadowing protected variable

    public void superAccess(){
        System.out.println(super.Var2); //Accessing inherited protected variable
    }
    public void myMethod2(){
        System.out.println("B's overridden protected method");
    }
    public void OverriddenMethod(A objA){ 
        //objA.myMethod2();
    }
}
public class A2_Q11{
    public static void main(String[] args){
        B objB = new B();
        
        // Inherited variables
        objB.Var2 = 5;
        objB.Var3 = 10;
        objB.Var4 = 15;

        // Inherited methods
        objB.myMethod2();
        objB.myMethod3();
        objB.myMethod4();

        //objB.Var1 = 20; //Shadowing private variable
        //private member can't be accessed
        //System.out.println("Shadowed private var in B: " +objB.Var1);
        
        //Accessing inherited variables
        objB.superAccess();

        //objB.OverriddenMethod(objB);
    }
}