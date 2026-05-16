import java.util.*;
class Difference
{
    public static void main(String arg[])
    {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter first number number:");
        int num1,num2,ans;
        num1=scn.nextInt();
        System.out.println("Enter first number number:");
        num2=scn.nextInt();
        ans=num1-num2;
        System.out.println("Difference of two numbers: "+ans);
    }
}