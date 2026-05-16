import java.util.*;
class Equal_array
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner (System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array values: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Solution sol=new Solution ();
        int result=sol.minMoves(arr);
        System.out.println("The equal array sum is : "+result);
    }
}
class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int count=0;
        for(int i=n;i>0;i--)
        {
            count+=nums[n]-nums[i-1];
        }
        return count;
    }
}