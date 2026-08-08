import java.util.*;
class Solution {
    public int singleNonDuplicate(int[] nums) {
        /* if(nums.length == 1)
            return nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                if(nums[i+1] != nums[i])
                {
                    return nums[i];
                }
            }
            else if(nums[i] == nums[nums.length-1])
            {
                if(nums[i-1] != nums[i])
                {
                    return nums[i];
                }
            }
            else
            {
                if(nums[i] != nums[i+1] && nums[i] != nums[i-1])
                {
                    return nums[i];
                }
            }
            
        }
        return 0; */

        if(nums.length == 1)
            return nums[0];
        if(nums[0] != nums[1])
            return nums[0];
        if(nums[nums.length-1] != nums[nums.length-2])
            return nums[nums.length-1];
        
        int low = 1;
        int high = nums.length-2;
        int mid = 0;
        while(low <= high)
        {
            mid = (low+high) / 2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1])
                return nums[mid];
            else if(mid % 2 == 1 && nums[mid] == nums[mid-1] || mid % 2 == 0 && nums[mid] == nums[mid+1])
            {
                low = mid +1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return mid;
    }
}
public class Single_sorted_array {
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
        int result = sol.singleNonDuplicate(arr);
        System.out.println("The single element is : " + result);
    }
}
