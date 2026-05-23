import java.util.*;
class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] > nums[i+1])
            {
                count++;
            }
        }
        if(nums[nums.length-1] > nums[0])
        {
            count++;
        }
        if(count<=1)
            return true;
        else
            return false;
    }
}
public class Array_sorted_rotated {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();        
        }
        Solution sol = new Solution();
        boolean result = sol.check(arr);
        if(result)
        {    
            System.out.println("The array is sorted and rotated ");
        }
        else
        {
            System.out.println("The array is not in sorted and rotated ");
        }
    }
}
