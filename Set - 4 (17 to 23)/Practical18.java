

class Member 
{
    String name;
    int age;
    double phone_num;
    String address;
    double salary;

   
    void displaySalary(int salary)
    {
        System.out.println("Salary of the member is : " + salary);
    }

  
}

class Employee extends Member
{
 String specialization;
 


void printEmployee(String name, int age, double phone_num, String address, double salary, String speclization)
{
    System.out.println("Enter your Name : " + name);
    System.out.println("Enter your Age : " + age);
    System.out.println("Enter your phone number :" + phone_num);
    System.out.println("Enter your Address : " + address);
    System.out.println("Enter your Specilization : " + speclization);
    //System.out.println("Salary of the member is : " + salary);
    displaySalary(180000);
}

//  }
 
}

class Manager extends Member
{
    String department;

    void displayManager(String name, int age, double phone_num, String address, double salary, String department)
    {
        System.out.println("Enter your Name : " + name);
        System.out.println("Enter your Age : " + age);
        System.out.println("Enter your phone number :" + phone_num);
        System.out.println("Enter your Address : " + address);
        System.out.println("Enter your Department : " + department);
        displaySalary(75000);
    }

   

}

public class Practical18
{
  public static void main(String[] args) 
    {
      
     Manager m = new Manager();
     m.displayManager("Isha",19,987987,"Gujarat",100,"CSE");

     Employee e = new Employee();

     e.printEmployee("Virat", 35, 999898, "Delhi",100, "Cricketer");

     System.out.println("23DCS075 Isha Patel");

    }  

 }
