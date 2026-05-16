import java.util.*;
class Good_pairs
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n=scn.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            num[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        int result=sol.numIdenticalPairs(num);
        System.out.println("The total good pairs are: "+result);
    }
}
class Solution {
    public int numIdenticalPairs(int[] nums) {
       int count=0;
       for(int i=0;i<nums.length;i++)
       {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j] && i<j)
                {
                    count++;
                }
            }
       } 
       return count;
    }
}