package banking;
import banking.Account;
public class Bank
{
    public static void main(String arg[])
    {
        Account acc=new Account("Milton",1000);
        acc.displayBalance();
    }
}