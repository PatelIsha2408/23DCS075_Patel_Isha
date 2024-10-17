class Rectangel
{
   double length;
   double breadth;

   Rectangel(double l,double b)  //constr.
   {
    this.length = l;
    this.breadth = b;
   }

   double Area() //method of rectangle class
   {
    return  length * breadth; 
   }

   double Perimeter()
   {
    return 2*(length + breadth);
   }
}


class Square extends Rectangel
{
   double side;

   public Square(double s)
   {
    super(s,s);   // Call the Rectangle constructor
    this.side = s;  // initilize the value
   }
   double Area() //method of rectangle class
   {
    return  side * side; 
   }

}

public class Practical19
 {
   public static void main(String[] args) 
   {
      Rectangel ra = new Rectangel(10, 20);
      ra.Area();
    
      System.out.println("Area of Rectangle is : " + ra.Area());
      System.out.println("Perimeter of Rectangel is : " + ra.Perimeter());

      Square sq = new Square(30);
      sq.Area();

      System.out.println("Area of Square is : " + sq.Area());

      System.out.println("23DCS075 Isha Patel");
    }  
  }
