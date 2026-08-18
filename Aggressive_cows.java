import java.util.*;
class Solution
{
    public int aggressiveCows(int[] arr, int k)
    {
        Arrays.sort(arr);
        int low = 0, high = arr.length-1;
        int mid = 0;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if(cowCount(arr,mid,k))
            {
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return high;
    }
    private boolean cowCount(int[] arr, int distance, int cows)
    {
        int count = 1, last = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] - last >= distance)
            {
                count++;
                last = arr[i];
            }
        }
        return count >= cows;
    }
}
public class Aggressive_cows {
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
        System.out.println("Enter the total cows to fit : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.aggressiveCows(arr, k);
        System.out.println("Aggressive cows in min distance is : " + ans);
    }
}
