// Q.10) Write a Java Program to define a class, describe its constructor, 
// overload the Constructors and instantiate its object.

class A1_Q10{
    private int intValue;
    private String strValue;

    // Default constructor
    public A1_Q10(){
        intValue = 0;
        strValue = "Default";
    }
    // Constructor with one parameter
    public A1_Q10(int value){
        intValue = value;
        strValue = "Java";
    }
    // Constructor with two parameters
    public A1_Q10(int intValue, String strValue){
        this.intValue = intValue;
        this.strValue = strValue;
    }
    void display() {
        System.out.println("intValue: " +intValue);
        System.out.println("stringValue: " +strValue);
    }
    public static void main(String[] args) {
        // Instantiating objects using different constructors
        A1_Q10 ob1 = new A1_Q10();
        A1_Q10 ob2 = new A1_Q10(10); 
        A1_Q10 ob3 = new A1_Q10(20, "Hello");

        // Displaying the values of objects
        System.out.println("Object 1:-");
        ob1.display();
        System.out.println();

        System.out.println("Object 2:-");
        ob2.display();
        System.out.println();

        System.out.println("Object 3:-");
        ob3.display();
    }
}