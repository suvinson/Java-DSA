import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums,int k) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.contains(nums[i]))
            {
                return true;
            }
            hs.add(nums[i]);
            if(i >= k)
            {
                hs.remove(nums[i - k]);
            }
        }
        return false;
    }
}
public class Contains_duplicate_II {
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
        System.out.println("Enter the kth element : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        boolean ans = sol.containsNearbyDuplicate(arr, k);
        if(ans)
        {
            System.out.println("Contains duplicate with valid condition ");
        }
        else
        {
            System.out.println("It doesn't Contains duplicate with valid condition ");
        }
    }
}
