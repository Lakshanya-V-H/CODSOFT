import java.util.*;
class UserAccount
{
    private double balance;
    UserAccount()
    {
        this.balance = 0.00;
    }
    
    void checkBalance()
    {
        System.out.println("Your account's balance is : "+balance);
    }
    
    void depositAmount(double amount)
    {
        try
        {
            balance = balance + amount;
            System.out.println("Amount has been deposited successfully !!!");
            System.out.println("Your account balance after deposit : "+balance);
        }
        catch(Exception e)
        {
            System.out.println("Sorry ! An error occured .... Please try again");
        }
    }
    
    void withdrawAmount(double amount)
    {
        try
        {
            if(amount > balance)
            {
                System.out.println("Insufficient balance to withdraw !!");
                System.out.println("Your account balance is : "+balance);
            }
            else
            {
                balance = balance - amount;
                System.out.println("Amount has been withdrawn successfully !!!");
                System.out.println("Your account balance after withdrawal : "+balance);
            }
        }
        catch(Exception e)
        {
            System.out.println("Sorry ! An error occured .... Please try again");
        }
    }
}
class ATM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        UserAccount userAccount = new UserAccount();
        
        while(true)
        {
            System.out.println("To Check Balance    ----   1");
            System.out.println("To Deposit Amount   ----   2");
            System.out.println("To Withdraw Amount  ----   3");
            System.out.println("To Exit             ----   4");
            System.out.println("Enter your choice : ");
            
            
            int ch = sc.nextInt();
            int flag=0;
            
            double amount;
            
            switch(ch)
            {
                case 1:
                    userAccount.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount to be deposited : ");
                    amount = sc.nextDouble();
                    userAccount.depositAmount(amount);
                    break;
                case 3:
                    System.out.println("Enter the amount for withdrawal : ");
                    amount = sc.nextDouble();
                    userAccount.withdrawAmount(amount);
                    break;
                case 4:
                    flag=1;
                    break;
                default :
                    System.out.println("Please Enter A Valid Choice");
            }
            if(flag==1)
                break;
            System.out.println("------------------------------------------------");
        }
    }
}