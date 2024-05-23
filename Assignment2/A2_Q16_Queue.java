/* Q.16) Write Java programs to implement the following using an array.
(a)Stack ADT
(b)Queue ADT */

import java.util.*;

class A2_Q16_Queue{
    private int maxSize;
    private int[] arr;
    private int front;
    private int rear;
    private int items;

    public A2_Q16_Queue(int size){
        maxSize = size;
        arr = new int[maxSize];
        front = 0;
        rear = -1;
        items = 0;
    }
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full. Cannot insert " +value);
            return;
        }
        if(rear == maxSize-1){
            rear = -1;
        }
        arr[++rear] = value;
        items++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty. Cannot remove!");
            return -1;
        }
        int temp = arr[front++];
        if(front == maxSize){
            front = 0;
        }
        items--;
        return temp;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty. Cannot peek!");
            return -1;
        }
        return arr[front];
    }
    public boolean isEmpty(){
        return(items == 0);
    }
    public boolean isFull(){
        return(items == maxSize);
    }
    public static void main(String[] args){
        A2_Q16_Queue queue = new A2_Q16_Queue(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Peek at front: " +queue.peek());
        System.out.println("Remove: " +queue.dequeue());
        System.out.println("Peek front after remove: " +queue.peek());
        System.out.println("Remove: " +queue.dequeue());
        System.out.println("Remove: " +queue.dequeue());
        queue.dequeue(); //queue is empty
    }
}