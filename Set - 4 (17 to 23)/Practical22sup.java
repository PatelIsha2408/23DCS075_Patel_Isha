

/* Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and 
CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an 
interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount
and CurrentAccount should implement the Account interface and have their own unique methods. */

interface Account
{
    void deposit();
    void withdraw();
    void calculate_interest();
    void view_balances();
}



class Bank 
{
    void list()
    {

    }

    void addAccount()
    {

    }
}

class SavingAccount implements Account
{
    public void deposit()
    {

    }

    public void withdraw()
    {
     
    }

    public void calculate_interest()
    {
    
    }

    public void view_balances()
    {
      
    }
 
}



class CurrentAccount implements Account
{
    public void deposit()
    {
      
    }

    public void withdraw()
    {
      
    }

    public void calculate_interest()
    {
     
    }

    public void view_balances()
    {
    
    }
}

public class Practical22sup 
{
    public static void main(String[] args)
    {

    
       SavingAccount sa = new SavingAccount();
       CurrentAccount ca = new CurrentAccount();

       
       System.out.println("Deposit.");
       sa.deposit();

       System.out.println("Withdraw.");
       sa.withdraw();

       System.out.println("Interest.");
       sa.calculate_interest();

       System.out.println("view Balance.");
       sa.view_balances();

    
    }
}
