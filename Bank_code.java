import java.util.*;
public class Bank_code {
    long num;
    long balance = 0;
    String name;
    long number;
    long wd;
    Scanner scn = new Scanner(System.in);
    void createAccount(){
        System.out.println("Enter your name : ");
        name = scn.next();
        System.out.println("Enter your phone number : ");
        number = scn.nextLong();
        Random rand = new Random();
        num = 1000000000L + (long)(rand.nextDouble() * 9000000000L);
        System.out.println("Your account number is : " + num);
    }

    void depositAmount(){
        System.out.println("Enter the amount to deposit : ");
        long deposit = scn.nextLong();
        if(deposit <=0)
        {
            throw new NullPointerException("Invalid amount");
        }
        else
            balance +=deposit;
    }

    void withdraw(){
        System.out.println("Enter the amount to withdraw : ");
        wd = scn.nextLong();
        if(wd>balance)
        {
            System.out.println("Invalid balance");
        }
        else
        {
            balance -=wd;
        }
    }

    void accountDetails(){
        System.out.println("Your name : " + name);
        System.out.println("Your phone number : " + number);
        System.out.println("Your account number : " + num);
        System.out.println("Your balance is : " + balance);
    }

    void balance(){
        System.out.println("Your balance is : " + balance);
    }
    public static void main(String arg[])
    {
        Bank_code bc = new Bank_code();
        System.out.println("1.Create an account");
        System.out.println("2.Deposit amount to your account");
        System.out.println("3.Withdraw amount from your account");
        System.out.println("4.Show account details");
        System.out.println("5.Balance");
        int ch;

        do{
            System.out.println("Enter the choice : ");
            ch = bc.scn.nextInt();
            switch(ch)
            {
                case 1:
                    {
                        bc.createAccount();
                        break;
                    }
                case 2:
                    {
                        bc.depositAmount();
                        break;
                    }
                case 3:
                    {
                        bc.withdraw();
                        break;
                    }
                case 4:
                    {
                        bc.accountDetails();
                        break;
                    }
                case 5:
                    {
                        bc.balance();
                        break;
                    }
                default :
                {
                    System.out.println("Invalid choice");
                }
            }
        }while(ch!=5);
    }
}
