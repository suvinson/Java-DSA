import java.util.*;
class Solution {
    public int medianMin(int[][] arr)
    {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++)
        {
            low = Math.min(low,arr[i][0]);
            high = Math.max(high,arr[i][m-1]);
        }
        int req = (n * m) / 2;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            int smaller = blackBox(arr,mid,m);
            if(smaller <= req)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return low;
    }
    private int blackBox(int[][] arr, int mid,int m)
    {
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            count += upperBound(arr[i],mid,m);
        }
        return count;
    }
    private int upperBound(int[] arr, int mid,int n)
    {
        int low = 0;
        int high = n - 1;
        int ans = n;
        while(low <= high)
        {
            int midi = (low + high) / 2;
            if(arr[midi] > mid)
            {
                ans = midi;
                high = midi - 1;
            }
            else
            {
                low = midi + 1;
            }
        }
        return ans;
    }
}
public class Median_row_sorted_matrix {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int row = scn.nextInt();
        System.out.println("Enter the column size : ");
        int col = scn.nextInt();
        System.out.println("Enter the matrix elements : ");
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        Solution sol = new Solution();
        int ans = sol.medianMin(arr);
        System.out.println("The median row sorted array is : " + ans);
    }
}
