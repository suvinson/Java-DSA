import java.util.*;
class Solution{
    public int upperBound(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length;
        int ans = arr.length;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(arr[mid] > target)
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
}
public class Upper_bound {
    public static void main(String arg[])
    {
        Scanner scn =  new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array values : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the target value : ");
        int target = scn.nextInt();
        Solution sol = new Solution();
        int result = sol.upperBound(arr, target);
        System.out.println("The upper bound is : " + result);
    }
}

