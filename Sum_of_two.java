import java.util.*;
class Sum_of_two
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner (System.in);
        int a,b;
        System.out.println("Enter two numbers :");
        a=scn.nextInt();
        b=scn.nextInt();
        Solution sol=new Solution();
        int result = sol.getSum(a,b);
        System.out.println("Sum of two integers without using + and - : " + result);
    }
}
class Solution {
    public int getSum(int a, int b) {
        while(b!=0)
        {
            int carry=(a&b)<<1;
            a=a^b;
            b=carry;
        }
        return  a;
    }
}