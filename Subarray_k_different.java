import java.util.*;
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return check(nums,k) - check(nums,k-1);
    }
    private int check(int[] nums, int k)
    {
        int count = 0;
        int r = 0 , l = 0 ;
        Map<Integer,Integer> ls = new HashMap<>();
        while( r < nums.length)
        {
            ls.put(nums[r],ls.getOrDefault(nums[r],0) + 1);

            while(ls.size() > k)
            {
                ls.put(nums[l] , ls.get(nums[l]) - 1);
                if(ls.get(nums[l]) == 0) 
                    ls.remove(nums[l]);
                l++;
            }
            count += (r - l + 1);
            r++;
        }
        return count;
    }
}
public class Subarray_k_different {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the kth element : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.subarraysWithKDistinct(arr, k);
        System.out.println("The subarray with k elements : " + ans);
    }
}
