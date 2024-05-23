/* Q.17) Write Java programs to implement the following using a singly linked list.
(a)Stack ADT
(b)Queue ADT */

import java.util.*;

class A2_Q17_Stack{
    private Node top;

    private class Node{
        int d1;
        Node next;
        
        Node(int d1){
            this.d1 = d1;
            this.next = null;
        }
    }
    public A2_Q17_Stack(){
        this.top = null;
    }
    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty. Cannot pop!");
            return -1;
        }
        int value = top.d1;
        top = top.next;
        return value;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty. Cannot peek!");
            return -1;
        }
        return top.d1;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public static void main(String[] args){
        A2_Q17_Stack stack = new A2_Q17_Stack();
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