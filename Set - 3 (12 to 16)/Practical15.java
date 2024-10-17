import java.util.*;

class Area
{
    double length;
    double breadth;

    Area(double l, double b) // Constructor to initialize the l & b.
    {
        length = l;
        breadth = b;
    }

    double returnArea()  // Method 
    {
        return length * breadth;
    }   

}

public class Practical15 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of rectangle : ");
       double l = sc.nextDouble();

        System.out.println("Enter the length of rectangle : ");
       double b = sc.nextDouble();


       Area ar = new Area(l,b);

       // Call the returnArea() method.
        System.out.println("The area of rectangel is :" + ar.returnArea());
        
        System.out.println("/n 23DCS075 Isha Patel");

    }
}
