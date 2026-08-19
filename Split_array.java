import java.util.*;
class Solution {
    public int splitArray(int[] nums, int k) {
        int low = lowest(nums);
        int high = highest(nums);
        int mid = 0;
        while(low <= high)
        {
            mid = (low + high) / 2;
            int value = isPossible(nums,mid);
            if(value > k)
            {
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return low;
    }
    private int isPossible(int[] arr , int mid)
    {
        int split = 1;
        int minCount = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(minCount + arr[i] > mid)
            {
                split += 1;
                minCount = arr[i];
            }
            else
            {
                minCount += arr[i];
            }
        }
        return split;
    }
    private int highest(int[] arr)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        return sum;
    }
    private int lowest(int[] arr)
    {
        int mini = 0;
        for(int i=0;i<arr.length;i++)
        {
            mini = Math.max(mini,arr[i]);
        }
        return mini;
    }
}
public class Split_array {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array values : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the kth element : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.splitArray(arr, k);
        System.out.println("Split Array Largest Sum is : " + ans);
    }
}
