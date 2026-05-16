import java.util.*;
class Trionic
{
    public static void main(String arg[])
    {
        Scanner scn =new Scanner(System.in);
        int n;
        System.out.println("Enter the array size:");
        n=scn.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            num[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        boolean result=sol.isTrionic(num);
        if(result)
            System.out.println("Its in Trionic order");
        else
            System.out.println("Its not in Trionic order");
    }
}
class Solution {
    public boolean isTrionic(int[] nums) 
    {
        if (nums.length < 3) 
            return false;
        int countUp1 = 0;
        int countDown = 0;
        int countUp2 = 0;
        int i = 0;
        // First Increasing
        while (i + 1 < nums.length && nums[i] < nums[i + 1]) 
        {
            countUp1++;
            i++;
        }
        // Must have first increasing
        if (countUp1 == 0) 
            return false;
        // Decreasing
        while (i + 1 < nums.length && nums[i] > nums[i + 1]) {
            countDown++;
            i++;
        }
        // Must have decreasing
        if (countDown == 0) 
            return false;
        // Second Increasing
        while (i + 1 < nums.length && nums[i] < nums[i + 1]) {
            countUp2++;
            i++;
        }
        // Must have second increasing
        if (countUp2 == 0) 
            return false;
        // Must reach end
        return 
            i == nums.length - 1;
    }
}