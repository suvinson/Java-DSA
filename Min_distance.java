import java.util.*;
class Min_distance
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int n,target,start;
        System.out.println("Enter the array size : ");
        n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array values : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        System.out.println("Enter the target value : ");
        target=scn.nextInt();
        System.out.println("Enter the start value : ");
        start=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.getMinDistance(arr,target,start);
        System.out.println("The minimum distance is : " + result);
    }
}
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                min=Math.min(min, Math.abs(i - start));
            }
        }
        return min;
    }
}