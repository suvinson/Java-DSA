import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 1;
        int last = intervals[0][1];

        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0] >= last)
            {
                count++;
                last = intervals[i][1];
            }
        }
        return intervals.length - count;
    }
}
public class Non_overlapping_intervals {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the column size : ");
        int n = scn.nextInt();
        System.out.println("Enter the intervals (n * 2 matrix) : ");
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("The actual interval ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        Solution sol = new Solution();
        int ans = sol.eraseOverlapIntervals(arr);
        System.out.println("The minimum removal of overlapping intervals : " + ans);
    }
}
