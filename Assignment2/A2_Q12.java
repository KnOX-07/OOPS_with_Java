// Q.12) Write a JAVA Program to demonstrate Constructor overloading 
//and Method overloading.

import java.util.*;

//Define class Rectangle(A2_Q12)
public class A2_Q12{
    private double length;
    private double width;

    public A2_Q12(){
        this.length = 1.0;
        this.width = 1.0;
    }
    public A2_Q12(double side){
        this.length = side;
        this.width = side;
    }
    public A2_Q12(double len, double wid){
        this.length = len;
        this.width = wid;
    }
    double calcArea(){
        return length*width;
    }
    //Overloaded method to calculate area
    double calcArea(double scale){
        return (length*scale)*(width*scale);
    }
    public static void main(String[] args){
        //Using different constructors
        A2_Q12 rect1 = new A2_Q12();
        A2_Q12 rect2 = new A2_Q12(5.0);
        A2_Q12 rect3 = new A2_Q12(3.0, 7.0);

        System.out.println("Rectangle1 area: " +rect1.calcArea());
        System.out.println("Rectangle2 area: " +rect2.calcArea());
        System.out.println("Rectangle3 area: " +rect3.calcArea());

        //Using overloaded method
        double scale = 2.0;
        System.out.println("Rectangle3 scaled area: " + rect3.calcArea(scale));
    }
}