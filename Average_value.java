import java.util.*;
class Average_value
{
    public static void main(String arg[])
    {
        Scanner scn= new Scanner (System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array values: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Solution sol= new Solution();
        int result= sol.averageValue(arr);
        System.out.println(" Average Value of Even Numbers That Are Divisible by Three is : "+ result);
    }
}
class Solution {
    public int averageValue(int[] nums) {
        int sum=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0 && nums[i]%3==0)
            {
                sum=sum+nums[i];
                count++;
            }
        }
        if(sum==0)
            return 0;
        else
            return sum/count;
    }
}