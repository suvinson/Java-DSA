import java.util.*;
class Digit_sum
{
    public static void main(String arg[])
    {
        Scanner scn= new Scanner(System.in);
        int n;
        System.out.println("Enter the array size: ");
        n=scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array values: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Solution sol = new Solution();
        int result= sol.differenceOfSum(arr);
        System.out.println("The difference is : "+ result);
    }
}
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,sum1=0,sum2=0,s=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(nums[i]<10)
                s+=nums[i];
            if(nums[i]>=10)
            {
                while(nums[i]!=0)
                {
                    int rev=nums[i]%10;
                    sum1=sum1+rev;
                    nums[i]/=10;
                }
            }
        }
        sum2=s+sum1;
        if(sum>sum2)
            return sum-sum2;
        else
            return sum2-sum;
    }
}