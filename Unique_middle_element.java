import java.util.*;
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums.length/2;
        int count= 0;
        for(int i=0;i<nums.length;i++)
            {
                if(nums[i] == nums[mid])
                {
                    count++;
                }
            }
        if(count == 1)
            return true;
        else 
            return false;
    }
}
public class Unique_middle_element {
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
        boolean result = sol.isMiddleElementUnique(arr);
        if(result)
        {
            System.out.println("The middle element exists exactly only once in the array ");
        }
        else
        {
            System.out.println("The middle element exists more than once in the array ");
        }
    }
}
