public class practical12
 {
    public static void main(String[] args)
 {
      
                float pounds = Float.parseFloat(args[0]);  //to convert String DT into float DT
                double rupees = pounds * 100.0;  // Conversion rate: 1 Pound = 100 Rupees
                System.out.println("Amount in Pounds: " + pounds);
                System.out.println("Amount in Rupees: " + rupees);
                }

        }