import java.util.*;
class Solution {
    public int minIndex(int[][] arr)
    {
       // Brute force
        /* int index = -1;
        int maxCount = 0;
        for(int i=0;i<arr.length;i++)
        {
            int count = 0;
            for(int j=0;j<arr[0].length;j++)
            {
                count += arr[i][j];
            }
            if(count > maxCount)
            {
                maxCount = count;
                index = i;
            }
        }
        return index; */

        //Optimised code 
        int index = -1;
        int maxCount = 0;
        for(int i=0;i<arr.length;i++)
        {
            int count = arr.length - rowAddition(arr[i]);
            if(count > maxCount)
            {
                maxCount = count;
                index = i;
            }
        }
        return index;
    }
    private int rowAddition(int[] ar)
    {
        int low = 0;
        int high = ar.length-1;
        int mid = 0;
        int oneValue = ar.length;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if(ar[mid] >= 1)
            {
                oneValue = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return oneValue;
    }
}
public class Maxi_ones {
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
        int ans = sol.minIndex(arr);
        System.out.println("The maximum 1's containing index is : " + ans);
    }   
}
