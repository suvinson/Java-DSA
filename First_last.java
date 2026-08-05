import java.util.*;
/* class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums,target);
        if(lb == nums.length || nums[lb] != target)
            return new int[]{-1,-1};
        return new int[]{lb,upperBound(nums,target)-1};
    }
    private int lowerBound(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length-1;
        int ans = 0;
        while(low <= high)
        {
            int mid = (low+high) / 2;
            if(nums[mid] >= target)
            {
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }
    private int upperBound(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;
        while(low <= high)
        {
            int mid = (low+high) / 2;
            if(nums[mid] > target)
            {
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }
} */
class Solution {
    public int[] searchRange(int[] nums, int target){
        Arrays.sort(nums);
        int first = firstOccurance(nums,target);
        if(first == -1)
            return new int[]{-1,-1};
        int last = lastOccurance(nums,target);
        return new int[]{first,last};
    }
    private int firstOccurance(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length-1;
        int first = -1;
        while(low <= high)
        {
            int mid = (low+high) / 2;
            if(nums[mid] == target)
            {
                first = mid;
                high = mid - 1;
            }
            else if(nums[mid] > target)
                high = mid - 1;
            else    
                low = mid + 1;
        }
        return first;
    }
    private int lastOccurance(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length-1;
        int last = -1;
        while(low <= high)
        {
            int mid = (low+high) / 2;
            if(nums[mid] == target)
            {
                last = mid;
                low = mid + 1;
            }
            else if(nums[mid] > target)
                high = mid - 1;
            else    
                low = mid + 1;
        }
        return last;
    }
}

public class First_last {
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
        int[] result = sol.searchRange(arr, target);
        System.out.println("The first and last position range is : ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }

    }
}
