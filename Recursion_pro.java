import java.util.*;
class Recursion_pro
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int n;
        System.out.println("Enter the number : ");
        n=scn.nextInt();
        natural(n);
    }
    public static void natural(int x)
    {
            if(x==1)
            {
                System.out.println(1);
            }
            else
            {
                System.out.print(x + " ");
                natural(x-1);
            }
    }
}