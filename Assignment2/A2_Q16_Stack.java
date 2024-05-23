/* Q.16) Write Java programs to implement the following using an array.
(a)Stack ADT
(b)Queue ADT */

import java.util.*;

class A2_Q16_Stack{
    private int maxSize; 
    private int[] arr;
    private int top;

    public A2_Q16_Stack(int size){
        maxSize = size;
        arr = new int[maxSize];
        top = -1; //stack is empty
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full. Cannot push " +value);
            return;
        }
        arr[++top] = value;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty. Cannot pop!");
            return -1;
        }
        return arr[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty. Cannot peek!");
            return -1;
        }
        return arr[top];
    }
    public boolean isEmpty(){
        return(top == -1);
    }
    public boolean isFull(){
        return(top == maxSize-1);
    }
    public static void main(String[] args){
        A2_Q16_Stack stack = new A2_Q16_Stack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Peek: " +stack.peek());
        System.out.println("Pop: " +stack.pop());
        System.out.println("Peek after pop: " +stack.peek());
        System.out.println("Pop: " +stack.pop());
        System.out.println("Pop: " +stack.pop());
        stack.pop(); //size of stack --> -1(empty)
    }
}