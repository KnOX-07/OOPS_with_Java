// Q.1) Write a java program in which thread sleep for 5 sec and change the 
// name of thread.

class Thread1 implements Runnable{
    public void run(){
        System.out.println("ThreadA is running...");
        try{
            Thread.sleep(5000);
            
            //Change the name of the thread
            Thread.currentThread().setName("ThreadB is executed...");
            
            System.out.println(Thread.currentThread().getName());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class A5_Q1{
    public static void main(String[] args){
        Thread th = new Thread(new Thread1());
        th.start();
    }
}