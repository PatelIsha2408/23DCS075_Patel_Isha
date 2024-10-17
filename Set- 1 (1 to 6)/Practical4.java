import java.util.*;

public class Practical4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[30];
        int sum=0;
        for(int i=0;i<30;i++){
           arr[i]=sc.nextInt();
           sum=sum+arr[i];
        }
    
        System.out.println("total :"+ sum);
        System.out.println("23dcs075 Isha Patel");
    }
}