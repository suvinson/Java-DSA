import java.util.*;
class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        
        int num = 1;
        int ans = k;
        while(hs.contains(ans))
        {
            ans = num * k;
            num++;
        }
        return ans;
    }
}
public class Smallest_k {
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
        int ans = sol.missingMultiple(arr, k);
        System.out.println("Smallest Missing Multiple of K is : " + ans);
    }
}
