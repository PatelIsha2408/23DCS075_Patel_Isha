public class Practical35
 {
    public static void main(String[] args) 
    {
        Thread1 t1 = new Thread1();
        t1.start(); // Start the thread

        System.out.println("23DCS075 Isha Patel");
    }
}

class Thread1 extends Thread 
{
    public void run()
     {
        int n = 0; // Variable to increment
        while (true) {
            n++; // Increment the variable
            System.out.println(n); // Display the current value
            try 
            
            {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                // Optionally handle the exception, e.g., log a message
                 System.out.println("Thread interrupted."); // Uncomment to log message
            }
        }
    }
}