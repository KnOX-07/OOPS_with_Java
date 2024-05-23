// Q.15) Write Java programs to implement the List ADT using arrays and linked lists.

import java.util.*;

public class A2_Q15_LL{
    private Node head;
    private int size;

    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public A2_Q15_LL(){
        head = null;
        size = 0;
    }
    void add(int value){
        if(head == null){
            head = new Node(value);
        }else{
            Node cur = head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = new Node(value);
        }
        size++;
    }
    public int get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bound!!");
        }
        Node cur = head;
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        return cur.data;
    }
    public int size(){
        return size;
    }
    public static void main(String[] args){
        A2_Q15_LL list = new A2_Q15_LL();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}