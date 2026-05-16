import java.util.*;
class Threedivisor
{
    public static void main(String arg[])
    {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num;
        num=scn.nextInt();
        Solution sol=new Solution();
        boolean result=sol.isThree(num);
        if(result)
            System.out.println(num+" has three divisors");
        else
            System.out.println(num+" has not exactly three divisors");

    }
}
class Solution {
    public boolean isThree(int n) {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==3)
        {
            return true;
        }
        else 
            return false;
    }
}