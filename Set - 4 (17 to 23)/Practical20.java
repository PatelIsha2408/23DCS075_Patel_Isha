class Shape
{
    void displayShape() 
    {
       System.out.println("This is shape.");
    }
    
}


class Rectangel extends Shape
{
    public Rectangel() 
    {
        
    }

    void displayRectangle() 
    {
       System.out.println("This is rectangular shape.");
    } 
}


class Circle extends Shape
{
    void displayCircle() 
    {
       System.out.println("This is Circular shape.");
    } 
}

class Square extends Rectangel
{
    void displaySquare() 
    {
       System.out.println("Square is a rectangel.");
    } 
}

public class Practical20
{
    public static void main(String[] args) 
    {

        // Shape s = new Shape();

        // s.displayShape();


        Rectangel r = new Rectangel();
        
    

        // Circle c = new Circle();
        // c.displayCircle();

        Square sq = new Square();

        sq.displaySquare();
        sq.displayRectangle();
        sq.displayShape();

        System.out.println("23DCS075 Isha Patel.");


    }
}
