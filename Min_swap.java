import java.util.*;
class Solution {
    public int minimumSwaps(int[] nums) {
     int count =0;
     for(int i=0;i<nums.length;i++)
     {
        if(nums[i]>0)
        {
            count++;
        }
     }
     int count1 =0;
     for(int i=0;i<count;i++)
     {
        if(nums[i] == 0)
        {
            count1++;
        }
     }
     return count1;
    }
}
public class Min_swap {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements with some zeros : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.minimumSwaps(arr);
        System.out.println("The minimum swaps to move zeros to end is : " + result);
    }
}
