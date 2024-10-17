class Degree
{
    void getDegree()
    {
        System.out.println("I got Degree.");
    }
}

class Undergratuate extends Degree
{
 void display()
 {
    System.out.println("I am Undergratuate.");
 }
}

class Postgraduate extends Degree
{
 void display()
 {
    System.out.println("I am Postgratuate.");
 }
}

public class Practical21 
{
    public static void main(String[] args) 
    {
        Degree d = new Degree();
        d.getDegree();

        Undergratuate ug = new Undergratuate();
        ug.display();

        Postgraduate pg = new Postgraduate();
        pg.display();

        System.out.println("23DCS075 Isha Patel");
    }

}
