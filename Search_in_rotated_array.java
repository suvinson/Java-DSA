import java.util.*;
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid = (low+high)/2;
        while(low<=high)
        {
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[low] <=nums[mid])
            {
                if(nums[low] <= target && nums[mid] >= target)
                {
                    high = mid -1;
                }
                else 
                {
                    low = mid + 1;
                }
            }
            else
            {
                if(nums[mid] <= target && nums[high] >= target)
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
            mid = (low+high)/2;
        }
        return -1;
    }
}
public class Search_in_rotated_array {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i = 0 ; i<n ;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the element to find the index in the array : ");
        int val = scn.nextInt();
        Solution sol = new Solution();
        int result = sol.search(arr,val);
        if(result == -1 )
        {
            System.out.println("Invalid element");
        }
        else 
        {
            System.out.println(val + " is in the index of : " + result);
        }
    }
}
