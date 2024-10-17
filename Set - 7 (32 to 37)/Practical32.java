public class Practical32
 {
    public static void main(String[] args) 
    {
        //A. by extending Thread class
        Thread t1 = new Thread1();
        t1.start();
        //B. by using Runnable interface.
        Thread t2 = new Thread(new Thread2());
        t2.start();
        System.out.println("23DCS075 Isha Patel");
    }
}

class Thread2 implements Runnable 
{
    public void run() 
    {
        System.out.println("Hello World in thread 2");
    }
}

class Thread1 extends Thread 
{
    public void run() {
        System.out.println("Hello World in thread 1");

        
    }
}