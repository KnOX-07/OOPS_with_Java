// Q.11) Write a Java Program to define a class, define instance methods and overload 
// them and use them for dynamic method invocation.

class A1_Q11{
    // Instance method without parameters
    void display(){
        System.out.println("Inside instance method without parameters");
    }
    // Overloaded instance method with one parameter of type int
    void display(int num){
        System.out.println("Inside instance method with parameter: " +num);
    }
    // Overloaded instance method with one parameter of type String
    void display(String msg){
        System.out.println("Inside instance method with parameter: " +msg);
    }

    // Main method for dynamic method invocation
    public static void main(String[] args) 
    {
        // Creating an object of my class
        A1_Q11 obj = new A1_Q11();

        // Dynamic method invocation
        obj.display();
        obj.display(10);
        obj.display("Hello");
    }
}