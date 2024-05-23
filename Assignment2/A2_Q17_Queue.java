/* Q.17) Write Java programs to implement the following using a singly linked list.
(a)Stack ADT
(b)Queue ADT */

import java.util.*;

class A2_Q17_Queue{
    private Node front, rear;

    private class Node{
        int d1;
        Node next;

        Node(int d1){
            this.d1 = d1;
            this.next = null;
        }
    }
    public A2_Q17_Queue(){
        this.front = this.rear = null;
    }
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty. Cannot remove!");
            return -1;
        }
        int value = front.d1;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return value;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty. Cannot peek!");
            return -1;
        }
        return front.d1;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public static void main(String[] args){
        A2_Q17_Queue queue = new A2_Q17_Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Peek: " +queue.peek());
        System.out.println("Remove: " +queue.dequeue());
        System.out.println("Peek after remove: " +queue.peek()); 
        System.out.println("Remove: " +queue.dequeue()); 
        System.out.println("Remove: " +queue.dequeue()); 
        queue.dequeue(); //queue is empty
    }
}