// Q.7) Write a JAVA program using Synchronized Threads, which demonstrates 
// Producer Consumer concept.

import java.util.*;

public class A5_Q7{
    public static void main(String[] args)
        throws InterruptedException
    {
        //Object of a class that has both produce() and consume() methods
        final PC pc = new PC();
 
        //Create producer thread
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                try{
                    pc.produce();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        // Create consumer thread
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                try{
                    pc.consume();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
 
        //t1 finishes before t2
        t1.join();
        t2.join();
    }
    //This class has a list, producer(adds items to list
    //and consumer(removes items).
    public static class PC{
        //Create a list shared by producer and consumer
        //Size of list is 2.
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;
 
        //Producer thread
        public void produce() throws InterruptedException
        {
            int value = 0;
            for(int i = 0; i <= 5; i++){
             //while(true){
                synchronized(this)
                {
                    //producer thread waits while list is full
                    while(list.size() == capacity)
                        wait();
                    System.out.println("Producer produced: " +value);
                    //Insert the jobs in the list
                    list.add(value++);
 
                    //notifies the thread to start consuming
                    notify();
                    Thread.sleep(1000);
                }
             //}
            }
        }
        //Consumer thread
        public void consume() throws InterruptedException
        {
            for(int i = 0; i <= 5; i++) {
             //while(true){
                synchronized(this)
                {
                    //Consumer thread waits while list is empty
                    while(list.size() == 0)
                        wait();
                    //Retrieve the first job in the list
                    int val = list.removeFirst();
                    System.out.println("Consumer consumed: " +val);
                    //Wake up producer thread
                    notify();
                    Thread.sleep(1000);
                }
             //}
            }
        }
    }
}