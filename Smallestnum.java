import java.util.*;
class Smallestnum
{
    public static void main(String arg[])
    {
        Scanner scn =new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=scn.nextInt();
        Solution sol=new Solution();
        int result = sol.smallestEvenMultiple(num);
        System.out.println("LCM is:  " + result);
    }
}
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0)
            return n;
        else
            return n*2;
    }
}