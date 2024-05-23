// Q.12) Write a Java Program to demonstrate use of nested class.

class A1_Q12 
{
    private int Val;

    // Constructor for OuterClass
    public A1_Q12(int val){
        this.Val = val;
    }
    void display1(){
        System.out.println("Outer class value: " +Val);
    }

    class NestedClass
    {
        private int nestedVal;

        // Constructor for NestedClass
        public NestedClass(int val){
            this.nestedVal = val;
        }
        void display2(){
            System.out.println("Nested class value: " +nestedVal);
        }
    }

    public static void main(String[] args) 
    {
        // Creating an object of Outer class
        A1_Q12 ob1 = new A1_Q12(100);
        
        // Creating an object of Nested class
        A1_Q12.NestedClass ob2 = ob1.new NestedClass(50);

        // Accessing methods of both Outer class and Nested class
        ob1.display1();
        ob2.display2(); 
    }
}