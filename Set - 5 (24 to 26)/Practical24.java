import java.util.Scanner;

public class Practical24
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        try 
        {
            System.out.print("Enter the value of x: ");
            int x = scanner.nextInt();

            System.out.print("Enter the value of y: ");
            int y = scanner.nextInt();

            int result = x / y;
            System.out.println("Result: " + result);
        } 
        
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Division by zero.");
        } catch (Exception e) 
        {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } finally 
        {
            scanner.close();
        }
        System.out.println("23DCS075 Isha Patel");
    }
}
