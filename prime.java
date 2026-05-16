import java.util.*;
class prime
{
    public static void main()
    {
        System.out.print("Enter the number: ");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int count=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.print("Its a Prime number");
        }
        else 
        {
            System.out.print("Its not a prime number");
        }
         
    }
}