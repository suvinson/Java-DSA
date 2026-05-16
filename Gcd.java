import java.util.*;
class Gcd
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n;
        n=scn.nextInt();
        System.out.println("Enter the array elements:");
        int num[]=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        int result=sol.findGCD(num);
        System.out.println("GCD is: " + result);
    }
}
class Solution {
    public int findGCD(int[] nums) {
        
        int min = nums[0];
        int max = nums[0];

        // Find min and max
        for (int num : nums) {
            if (num < min) 
                min = num;
            if (num > max) 
                max = num;
        }
        // GCD using Euclidean algorithm
        while (min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }
        return max;
    }
}