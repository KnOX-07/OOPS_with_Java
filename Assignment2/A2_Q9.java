// Q.9) Write a java program in which you will declare an abstract class Vehicle 
// inherits this class from two classes car and truck using the method engine
// in both display "car has good engine" and "truck has bad engine".

import java.util.*;

abstract class Vehicle{
    //Abstract method to be implemented by subclasses
    abstract void engine();
}
//Car class inherits from Vehicle
class Car extends Vehicle{
    void engine(){
        System.out.println("Car has good engine");
    }
}
//Truck class inherits from Vehicle
class Truck extends Vehicle{
    void engine(){
        System.out.println("Truck has bad engine");
    }
}
public class A2_Q9{
    public static void main(String[] args){
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        
        car.engine();
        truck.engine();
    }
}