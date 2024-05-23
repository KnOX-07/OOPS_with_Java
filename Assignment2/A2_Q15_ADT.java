// Q.15) Write Java programs to implement the List ADT using arrays and linked lists.

import java.util.*;

public class A2_Q15_ADT{
    private int[] d1;
    private int size;

    public A2_Q15_ADT(){
        d1 = new int[10];
        size = 0;
    }
    void add(int value){
        if(size == d1.length){
            resize();
        }
        d1[size++] = value;
    }
    public int get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bound!!");
        }
        return d1[index];
    }
    public int size(){
        return size;
    }
    void resize(){
        int[] d2 = new int[d1.length * 2];
        System.arraycopy(d1, 0, d2, 0, d1.length);
        d1 = d2;
    }
    public static void main(String[] args){
        A2_Q15_ADT list = new A2_Q15_ADT();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);   

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}