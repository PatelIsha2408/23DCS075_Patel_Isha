import java.util.*;
public class Practical9 
{
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(double_char(str));
        System.out.println("23DCS075 Patel Isha");
        sc.close();
    }
    public static String double_char(String str) {
        String result = "";
        for (int i = 0; i<str.length(); i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;
    } 
}
