
import java.util.*;
public class Practical7
     
    {
        public static void main(String[] args){
        String s1="Chocolate";
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        front_times(s1, n);

        System.out.println("\n 23DCS075 Isha Patel");

    }

    static void front_times(String s1,int n ){
        String s=s1.substring(0,3);
         for(int i=0;i<n;i++){
             System.out.print(s);
        }
     }   
    }

