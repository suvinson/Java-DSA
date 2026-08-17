import java.util.*;
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = maxi(weights);
        int sum = add(weights);
        /* for(int i=max;i<=sum;i++)
        {
            int minDays = day(weights, i);
            if(minDays <= days)
            {
                return i;
            }
        } */
        int mid = 0;
        int ans = 0;
        while(max <= sum)
        {
            mid = (max + sum) / 2;
            int minDays = day(weights, mid);
            if(minDays <= days)
            {
                ans = mid;
                sum = mid -1;
            }
            else
            {
                max = mid + 1;
            }
        }
        return ans;
    }
    private int day(int[] weights, int max)
    {
        int Days = 1;
        int load = 0;
        for(int i=0;i<weights.length;i++)
        {
            if(load + weights[i] > max)
            {
                Days += 1;
                load = weights[i];
            }
            else
            {
                load += weights[i];
            }
        }
        return Days;
    }
    private int maxi(int[] weights)
    {
        int maxii = 0;
        for(int i=0;i<weights.length;i++)
        {
            maxii = Math.max(maxii,weights[i]);
        }
        return maxii;
    }
    private int add(int[] weights)
    {
        int sum = 0;
        for(int i=0;i<weights.length;i++)
        {
            sum += weights[i];
        }
        return sum;
    }
}
public class Capacity_of_ship {
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
        System.out.println("Enter the total days to carry all the weights : ");
        int weights = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.shipWithinDays(arr, weights);
        System.out.println("Capacity To Ship Packages in " + ans + " Days");
    }
}
