import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> result = new ArrayList<>();

        for(int i = 0; i < intervals.length; i++)
        {
            if(intervals[i][1] < newInterval[0])
            {
                result.add(intervals[i]);
            }
            else if(intervals[i][0] > newInterval[1])
            {
                result.add(newInterval);
                newInterval = intervals[i];

            }
            else
            {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        result.add(newInterval);

        return result.toArray(new int[0][]);
    }
}
public class Insert_interval {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int row = scn.nextInt();
        System.out.println("Enter the column size : ");
        int col = scn.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the intervals : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter the new intervals to merge ");
        int[] ar = new int[2];
        for(int i=0;i<2;i++)
        {
            ar[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int[][] ans = sol.insert(arr, ar);
        System.out.println("The final array is : ");
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
