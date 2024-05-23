// Q.6) Write a program to implement the concept of threading by implementing 
// Runnable Interface

class ThreadA implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Thread A with i = " + -1*i);
        }
        System.out.println("Exiting from Thread A...");
    }
}
class ThreadB implements Runnable{
    public void run(){
        for(int j=1; j<=5; j++){
            System.out.println("Thread B with j = " + 2*j);
        }
        System.out.println("Exiting from Thread B...");
    }
}
class ThreadC implements Runnable{
    public void run(){
        for(int k=1; k<=5; k++){
            System.out.println("Thread C with k = " + (2*k-1));
        }
        System.out.println("Exiting from Thread C...");
    }
}
public class A5_Q6{
    public static void main(String[] args){
    ThreadA x = new ThreadA();
    Thread th1 = new Thread(x);

    ThreadB y = new ThreadB();
    Thread th2 = new Thread(y);

    Thread th3 = new Thread(new ThreadC());
    
    th1.start();
    th2.start();
    th3.start();

    try{
        //Waiting for all threads to finish
        th1.join();
        th2.join();
        th3.join();
    }catch(InterruptedException e){
        System.out.println("Threads interrupted...");
    }
    System.out.println("...Multithreading is over");
    }
}