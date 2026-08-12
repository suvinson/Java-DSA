import java.util.*;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = maxElement(piles);
        int low = 1;
        int high = max;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            int total = totalHours(piles,mid);
            if(total <= h)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return low;
    }
    private int maxElement(int[] arr)
    {
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    private int totalHours(int[] arr, int n)
    {
        int total = 0;
        for(int i=0;i<arr.length;i++)
        {
            total += Math.ceil((double) arr[i]/n);
        }
        return total;
    }
}
public class Koko_banana {
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
        System.out.println("Enter the max hours to eat all bananas : ");
        int h = scn.nextInt();
        Solution sol = new Solution();
        int result = sol.minEatingSpeed(arr, h);
        System.out.println("Koko Eating all Bananas within " + result + " hours");
    }
}
