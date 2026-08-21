import java.util.*;
class Solution {
    public long findKthSmallest(int[] coins, int k) {
        long low = mini(coins);
        long high = low * k;
        long mid = 0;
        long ans = 0;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if(search(mid,coins) >= k)
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }
    private long search(long mid, int[] arr) {

        int n = arr.length;
        long count = 0;
        for (int mask = 1; mask < (1 << n); mask++) {
            long lcm = 1;
            int bits = 0;
            boolean valid = true;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    bits++;
                    long g = gcd(lcm, arr[i]);
                    lcm = (lcm / g) * arr[i];
                    if (lcm > mid) {
                        valid = false;
                        break;
                    }
                }
            }
            if (!valid) {
                continue;
            }
            long current = mid / lcm;
            if (bits % 2 == 1) {
                count += current;
            }
            else {
                count -= current;
            }
        }
        return count;
    }
    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }

        return a;

    }
    
    private long mini(int[] arr)
    {
        long minii = Long.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            minii = Math.min(minii,arr[i]);
        }
        return minii;
    }
}
public class Single_denomination {
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
        long ans = sol.findKthSmallest(arr, k);
        System.out.println("Kth Smallest Amount With Single Denomination Combination is : " + ans);
    }
}
