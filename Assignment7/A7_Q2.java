// Q.2) Write a program to implement the concept of Exception Handling by creating 
// user defined exception.

class MyStrException extends Exception{
    String s1;

    MyStrException(String s2){
        s1 = s2;
    }
    public String toString(){
        return("MyStrException occured: "+s1);
    }
}
public class A7_Q2{
    public static void main(String[] args){
        try{
            System.out.println("This is inside try block.");
            throw new MyStrException("This is my error message!");
        }
        catch(MyStrException e){
            System.out.println("Catch block.");
            System.out.println(e);
        }
    }
}