import java.util.*;
class Solution {
    public boolean search(int[] nums, int target) {
        /* for(int i=0;i<nums.length;i++)
        {
            if(target == nums[i])
            {
                return true;
            }
        } 
        return false; */
        
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while(low <= high)
        {
            mid = (low+high) / 2;
            if(target == nums[mid])
            {
                return true;
            }
            if(nums[low] == nums[mid] && nums[mid] == nums[high])
            {
                low = low + 1;
                high = high - 1;
                continue;
            }
            else if(nums[low] <= nums[mid])
            {
                if(target >= nums[low] && target <= nums[mid])
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else
            {
                if(target >= nums[mid] && target <= nums[high])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
public class Rotated_sorted_array_II {
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
        System.out.println("Enter the target element : ");
        int target = scn.nextInt();
        Solution sol = new Solution();
        boolean result = sol.search(arr, target);
        if(result)
        {
            System.out.println("The target element is exist in the array  ");
        }
        else
            System.out.println("The target element is not exist in the array  ");
    }
}
