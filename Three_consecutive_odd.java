import java.util.*;
class Three_consecutive_odd
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n=scn.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            ar[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        boolean result=sol.threeConsecutiveOdds(ar);
        if(true)
        {
            System.out.println("There are three consecutive odds in the array");
        }
        else 
            System.out.println("There is not a  three consecutive odds in the array");
    }
}
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
       int count=0;
       for(int i=0;i<arr.length;i++)
       {
            if(arr[i]%2==0)
            {
               count=0;
            }
            else 
                 count++;
            if(count==3)
            {
                return true;
            }
       } 
        return false;
    }
}