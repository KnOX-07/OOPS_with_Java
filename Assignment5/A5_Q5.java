// Q.5) Write a program to implement the concept of threading by extending Thread Class.

class A5_Q5 extends Thread{
    private String thread;

    A5_Q5(String name){
        thread = name;
    }
    //Overriding run() method
    public void run(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println(thread+ ": " + i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println(thread+ " interrupted...");
        }
        System.out.println("...Exiting from " +thread);
    }
    public static void main(String[] args){
        A5_Q5 th1 = new A5_Q5("Thread 1");
        A5_Q5 th2 = new A5_Q5("Thread 2");

        th1.start();
        th2.start();
    }
}