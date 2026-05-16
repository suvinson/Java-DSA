//3010. Divide an Array Into Subarrays With Minimum Cost I
import java.util.*;
class Subarray{
    public static void main(String arg[]){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=scn.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            num[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        int result=sol.minimumCost(num);
        System.out.println(result);
    }
}
class Solution {
    public int minimumCost(int[] nums) {
        int sum;
        int temp;
        sum=nums[0];
        for(int i=1;i<=nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        sum=sum+nums[1]+nums[2];
        return sum;
    }
}