import java.util.*;
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans = 0, start = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
         for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            while(map.get(nums[i]) > k)
            {
                start++;
                map.put(nums[start], map.get(nums[start]) -1);
            }
            ans = Math.max(ans, i - start);
        }
        return ans;
    }
    /* private int map(int[] arr,int j, int n,int k)
    {
           HashMap<Integer,Integer> map = new HashMap<>();
           for(int i=j;i<n;i++)
           {
               if(map.getOrDefault(arr[i],0) < k )
                 map.put(arr[i],map.getOrDefault(arr[i],0)+1);
           }
           int total=0;
           for(int count : map.values())
           {
               total += count;
           }
           return total;
    } */
}
public class Longest_frequency {
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
        System.out.println("Enter the max frequency : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        int result = sol.maxSubarrayLength(arr, k);
        System.out.println("Length of Longest Subarray With at Most K Frequency : " + result);
    }
}
