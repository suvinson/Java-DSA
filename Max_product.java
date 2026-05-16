import java.util.*;
class Max_product
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner (System.in);
        int n;
        System.out.println("Enter the array size : ");
        n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        int result= sol.maxProduct(arr);
        System.out.println("The maximum product of two index: " + result);
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}