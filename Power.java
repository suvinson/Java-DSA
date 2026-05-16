import java.util.*;
class Power{
    public static void main(String args[])
    {
        Scanner scn =new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=scn.nextInt();
        Solution sol=new Solution();
        boolean result=sol.isPowerOfTwo(num); 
        if(result)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
        {
            return false;
        }
        while(n>1)
        {
            if(n%2==0)
                n=n/2;
            else 
                return false;
        }
        if(n==1)
        {
            return true;
        }
        else
            return false;
    }
}