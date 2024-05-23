// Q.2) Write a java program for multithread in which user thread and thread started 
// from main method invoked at a time each thread sleep for 1 sec.

class UserThread extends Thread{
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("User Thread: " + Thread.currentThread().getName());
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class A5_Q2{
    public static void main(String[] args){
        //Creating a user thread
        UserThread userThread = new UserThread();
        
        //Creating a thread from the main method
        Thread mainThread = new Thread(new Runnable(){
            public void run(){
                try{
                    Thread.sleep(1000);
                    System.out.println("Main Thread: " + Thread.currentThread().getName());
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        userThread.start();
        mainThread.start();
    }
}