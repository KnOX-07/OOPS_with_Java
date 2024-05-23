// Q.3) Write a java program for to solve producer consumer problem in which a producer 
// produces a value and consumer consume the value before producer generate 
// the next value.

import java.util.*;

class Buffer{
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;

    public Buffer(int capacity){
        this.capacity = capacity;
    }
    public synchronized void produce(int value){
        while(buffer.size() == capacity){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        buffer.add(value);
        System.out.println("Producer produced: " +value);
        notifyAll();
    }
    public synchronized int consume(){
        while(buffer.isEmpty()){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        int value = buffer.remove();
        System.out.println("Consumer consumed: " +value);
        notifyAll();
        return value;
    }
}
class Producer extends Thread{
    private Buffer buffer;

    public Producer(Buffer buffer){
        this.buffer = buffer;
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            buffer.produce(i);
            try {
                sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Consumer extends Thread{
    private Buffer buffer;

    public Consumer(Buffer buffer){
        this.buffer = buffer;
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            int value = buffer.consume();
            try{
                sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class A5_Q3{
    public static void main(String[] args){
        Buffer buffer = new Buffer(5);
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}