//odd or even program
import java.util.*;
class Oddoreven{
    public static void main(String args[])
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scn.nextInt();
        if(num%2==0)
        {
             System.out.println( num  +  "  is an even number ");
        }
        else
        {
            System.out.println(num + "  is an odd number ");
        }
    }
    
}