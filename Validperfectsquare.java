import java.util.*;
class Validperfectsquare
{
    public static void main(String arg[])
    {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n;
        n=scn.nextInt();
        Solution sol=new Solution();
        boolean result=sol.isPerfectSquare(n);
        if(result)
            System.out.println(n + " is a Perfect Square");
        else
            System.out.println(n + " is not a Perfect Square");
    }
}
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<1)
            return false;
        for(long i=1;i*i<=num;i++)
        {
            if(i*i==num)
                return true;
        }
        return false;
    }
}