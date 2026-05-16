import java.util.*;
class Current
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
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
        int result[]=sol.smallerNumbersThanCurrent(arr);
        System.out.println("Numbers Are Smaller Than the Current Number order :");
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    count++;
                }
            }
            arr[i]=count;
            count=0;
        }
        return arr;
    }
}