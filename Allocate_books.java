import java.util.*;
class Solution {
    public int allocateBooks(int[] arr, int k)
    {
        Arrays.sort(arr);
        int low = arr[0];
        int high = maxi(arr);
        int mid = 0;
        int ans = 0;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if(isPossible(arr,mid,k))
            {
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }
    private int maxi(int[] arr)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        return sum;
    }
    private boolean isPossible(int[] arr, int mid , int k)
    {
        int pages = 0 , allocateStudents = 1;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] > mid)
            {
                return false;
            }
            if(pages + arr[i] > mid)
            {
                allocateStudents += 1;
                pages = arr[i];
            }
            else
            {
                pages  += arr[i];
            }
        }
        if(allocateStudents > k)
        {
            return false;
        }
        else
            return true;
    }
}
public class Allocate_books {
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
        System.out.println("Enter the total student : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.allocateBooks(arr, k);
        System.out.println("The minimum book allocation is : " + ans);
    }
}
