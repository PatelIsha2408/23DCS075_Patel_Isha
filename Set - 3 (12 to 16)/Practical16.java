import java.util.*;

class complex 
{

    int a;
    int b;

    complex()    // Default constructor
    {

    }

    
    complex(int r,int i) // Parameterized constructor to initialize
    {
        this.a=r;
        this.b=i;
    }


    void add(complex c1)   // Class Method
    {
        System.out.print("Additon of two complex number --> ");
        System.out.println((a + c1.a) + " + "+ (b + c1.b)+"i ");
    }

    void sub(complex c1) 
    {
        System.out.print("Substraction of two complex number --> ");
        System.out.println((a - c1.a) + " + "+ (b - c1.b)+"i ");
    }

    void mul(complex c1)
     {
        System.out.print("Multiplication of two Complex number --> ");
        System.out.println((a * c1.a - b * c1.b) + " + "+ (a * c1.b + b * c1.a)+"i ");
    }

    void display()  // Method to display complex num.
    {
        System.out.println("Real = " + a);
        System.out.println("Img = " + b);
    }

}

public class Practical16
{

    public static void main(String[] args) 
    
    {
        complex c1 = new complex();
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter real number : ");
        int r1 = sc.nextInt();

        System.out.print("Enter img number : ");
        int i1 = sc.nextInt();

        System.out.print("Enter real number : ");
        int r2 = sc.nextInt();

        System.out.print("Enter img number : ");
        int i2 = sc.nextInt();

        complex c2 = new complex(r1,i1);
        complex c3 = new complex(r2,i2);

        c2.display();
        c3.display();

        c2.add(c3); //
        c2.sub(c3);
        c2.mul(c3);

        System.out.println("23DCS075 Isha Patel");
    }
}