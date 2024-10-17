
import java.util.Scanner;

interface AdvancedArithmetic 
{
   int divisor_sum(int n); // Signature / interface method (does not have a body)
}

 
class MyCalculator implements AdvancedArithmetic
{

   // @Override  // Annotation
    public int  divisor_sum(int n)
    {
        if (n == 1)
        {
            return 1;
        }

        int sum = n + 1;

        for (int i=2; i<n; i++)
        {
            if (n % i == 0) 
            {
                sum = sum + i;
            }
        }

        return sum;
    }
}

public class Practical22 
{
    public static void main(String[] args) 
    {
      
        MyCalculator cal = new MyCalculator();

        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt(); // read from user

        int sum = cal.divisor_sum(num); // calculate sum 

        System.out.println("The sum is " + sum);
        
        System.out.println("23DCS075 Isha Patel");
    }
}


