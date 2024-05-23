// Q.4) Write a java program for to solve printer synchronization problem in 
// which all the jobs must be completed in order.

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

class Printer{
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private int currentJobNo = 1;

    public void print(int jobNumber){
        lock.lock();
        try{
            while(jobNumber != currentJobNo){
                try{
                    System.out.println("Waiting for job " +jobNumber+ " to be printed...");
                    condition.await();
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt(); //Reset interrupt status
                }
            }
            System.out.println("Printing job " +jobNumber);
            currentJobNo++;
            condition.signalAll();
        }finally{
            lock.unlock();
        }
    }
}
class PrintJob implements Runnable{
    private final Printer printer;
    private final int jobNumber;

    public PrintJob(Printer printer, int jobNumber){
        this.printer = printer;
        this.jobNumber = jobNumber;
    }
    public void run(){
        printer.print(jobNumber);
    }
}
public class A5_Q4{
    public static void main(String[] args){
        Printer printer = new Printer();
        Thread[] th = new Thread[10];

        for(int i = 0; i < th.length; i++){
            th[i] = new Thread(new PrintJob(printer, i+1));
            th[i].start();
        }
        for(Thread thread : th){
            try{
                thread.join(); //Wait for all threads to finish
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}