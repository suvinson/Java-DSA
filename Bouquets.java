import java.util.*;
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m*k > bloomDay.length)
            return -1;
        int low = mini(bloomDay);
        int high = maxi(bloomDay);
        int mid = 0;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if(possible(bloomDay,mid,m,k))
            {
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return low;
    }
    private int maxi(int[] arr)
    {
        int maxii = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            maxii = Math.max(maxii,arr[i]);
        }
        return maxii;
    }
    private int mini(int[] arr)
    {
        int minii = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            minii = Math.min(minii,arr[i]);
        }
        return minii;
    }
    private boolean possible(int[] arr, int j, int m, int k)
    {
        int count = 0, bouquets = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] <= j)
            {
                count++;
            }
            else
            {
                bouquets += (count/k);
                count = 0;
            }
        }
        bouquets += (count/k);
        return bouquets >= m;
    }
} 
public class Bouquets {
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
        System.out.println("Enter the number of bouquet : ");
        int m = scn.nextInt();
        System.out.println("Enter the number of flowers should be in the  bouquet : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        int result = sol.minDays(arr, m, k);
        System.out.println("Minimum Number of Days to Make m Bouquets is : " + result);
    }
}
