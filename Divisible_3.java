import java.util.*;
class Divisible_3
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        int result = sol.minimumOperations(arr);
        System.out.println("Minimum Operations to Make All Elements Divisible by Three is : " + result);
    }
}
class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%3==0)
            {
                count++;
            }
        }
        if(count==nums.length)
            return 0;
        int count1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%3!=0)
            {
                if((nums[i]+1)%3 == 0 || (nums[i]-1)%3 == 0)
                {
                    count1++;
                }
            }
        }
        return count1;
    }
}