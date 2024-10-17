class Parent
{
    void displayParent() //method
    {
        System.out.println("This is Parent Class.");
    }

   
}
class Child extends Parent //subclass
{
    void displayChild()
    {
        System.out.println("This is Child Class.");
    }
}

public class Practical17 
{
 public static void main(String[] args) 
 {
     Parent p = new Parent();
     Child c = new Child();


     p.displayParent(); //calling Parent class with the use of child class obj.

     c.displayChild();  //calling child class with the use of child class obj.

    System.out.println("23DCS075 Patel Isha");
 }   
}
