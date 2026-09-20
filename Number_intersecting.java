import java.util.*;
class Solution {
    public int countIntersectingIntervals(int[][] arr) {

        int count = 0;

        for(int k=0;k<arr.length;k++)
        {
            for(int i= k + 1;i<arr.length;i++)
            {
                if(arr[i][0] <= arr[k][arr[k].length - 1] && arr[k][0] <= arr[i][arr[k].length - 1] )
                {
                    count++;
                }
            }
        }
        return count;
    }
}
public class Number_intersecting {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int row = scn.nextInt();
        System.out.println("Enter the column size : ");
        int col = scn.nextInt();
        System.out.println("Enter the matrix values : ");
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        Solution sol = new Solution();
        int ans = sol.countIntersectingIntervals(arr);
        System.out.println("The number of intersections are : " + ans);
    }
}
