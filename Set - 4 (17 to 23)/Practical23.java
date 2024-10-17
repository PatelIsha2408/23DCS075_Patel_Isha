
interface Shape 
{
    double getArea();

    String getColor();

    String getShapeName();
}

class Circle implements Shape 
{
    double radius;
    String color;
    
    public double getArea() // method 
    {
        return 3.14 * radius * radius;
    }

    public Circle(double r, String c)
    {
        this.radius = r;
        this.color = c;
    }

    public String getShapeName()
    {
        return "Circle";
    }

    public String getColor()
    {
        return color;
    }
    
}

class Rectangle implements Shape 
{
    double length;
    double width;
    String color;

    public double getArea() 
    {
        return length * width;
    }

    public Rectangle(double l, double w, String c) // l and w is local constructor var. accessible / valid till curley bracket.
    {
       this.length = l;
       this.width = w;
       this.color = c;
    }

    public String getShapeName()
    {
        return color;
    }

    public String getColor()
    {
        return "Blue";
    }
    

}

class Signs
{
    String text;
    Shape bgShape;

    String displayText()
    {
        return text;
    }

    public Signs(String t , Shape bs)
    {
        this.text = t;
        this.bgShape = bs;

    }

}

public class Practical23 
{
    public static void main(String[] args) 
    {
       Circle cr = new Circle(10, "Red");

      Rectangle ra = new Rectangle(20, 30, "Blue");

      Signs sg = new Signs("Isha", cr); //create sign class object with text and circle class object

       System.out.println("Display Text " + sg.displayText()); // call method of sigh class using sign class object
       System.out.println("Shape is " + sg.bgShape.getShapeName()); // call method of circle class using sign class' bgShape variable which holds circle class object
       System.out.println("Area of shape is: " + sg.bgShape.getArea());// same as above
       System.out.println("Color :" + sg.bgShape.getColor());

       Signs sg1 = new Signs("Virat", ra);

       System.out.println("Display Text " + sg1.displayText());
       System.out.println("Shape is " + sg1.bgShape.getShapeName());
       System.out.println("Area of shape is: " + sg1.bgShape.getArea());
       System.out.println("Color :" + sg1.bgShape.getColor());

       System.out.println("23DCS075 Isha Patel");
    }
}