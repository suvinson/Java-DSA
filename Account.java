package banking;
public class Account
{
    public String accountHolder;
    public double balance;
    public Account(String a, double b)
    {
        accountHolder=a;
        balance=b;
    }
    public void displayBalance()
    {
        System.out.println(accountHolder + " 's Balance: $"+ balance);
    }
}