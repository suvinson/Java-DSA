import java.util.*;
class Solution {
    public int findKthPositive(int[] arr, int k) {
        //Brute force 
        /* for(int i=0;i<arr.length;i++)
        {
            if(arr[i] <= k)
            {
                k++;
            }
            else
            {
                break;
            }
        }
        return k; */

        // Optimised code 
        int low = 0,high = arr.length-1;
        int mid = 0;
        int missing = 0;
        while(low <= high)
        {
            mid = (low + high) / 2;
            missing = arr[mid] - (mid+1);
            if(missing < k)
            {
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return low + k;

    }
}
public class Missing_elements {
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
        int ans = sol.findKthPositive(arr, k);
        System.out.println("The missing element is : " + ans);
    }
}
