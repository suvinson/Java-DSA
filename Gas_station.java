import java.util.Scanner;

class Solution
{
    public double gasCount(int[] arr, int k)
    {
        double low = 0;
        double high = 0;
        for(int i=0;i<arr.length-1;i++)
        {
            high = Math.max(high,(double) (arr[i+1] - arr[i]));
        }
        while(high - low > 1e-6)
        {
            double mid = (low + high) / 2.0;
            if(isPossible(arr,mid,k))
            {
                high = mid;
            }
            else
            {
                low = mid;
            }
        }
        return high;
    }
    private boolean isPossible(int[] arr, double mid , int k)
    {
        int count = 0;
        for(int i=0;i<arr.length-1;i++)
        {
            double gap = arr[i+1] - arr[i];
            int diff = (int) Math.ceil(gap / mid) - 1 ;
            count += diff;
            if (count > k) {
                return false;
            }
        }
        return true;
    }
}
public class Gas_station {
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
        double ans = sol.gasCount(arr, k);
        System.out.println("Required gas station is  : " + ans);
    }
}
