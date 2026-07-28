import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        /* Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> ls = new ArrayList<>();
        for(int i=0;i<intervals.length;i++)
        {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(!ls.isEmpty() && end <= ls.get(ls.size() - 1)[1])
            {
                continue;
            }
            for(int j=i+1;j<intervals.length;j++)
            {
                if(intervals[j][0] <= end)
                {
                    end = Math.max(end , intervals[j][1]);
                }
                else
                {
                    break;
                }
            }
            ls.add(new int[]{start, end});
        }
        return ls.toArray(new int[ls.size()][]); */
        
        //optimised code 
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> ls = new ArrayList<>();
        for(int i=0;i<intervals.length;i++)
        {
            if(ls.isEmpty() || intervals[i][0] > ls.get(ls.size()-1)[1])
            {
                ls.add(intervals[i]);
            }
            else
            {
                ls.get(ls.size()-1)[1] = Math.max(ls.get(ls.size()-1)[1],intervals[i][1]);
            }
            
        }
        return ls.toArray(new int[ls.size()][]);
    }
}
public class Merge_intervals {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the row : ");
        int row  = scn.nextInt();
        System.out.println("Enter the size of the column : ");
        int column  = scn.nextInt();
        System.out.println("Enter the matrix elements : ");
        int[][] arr = new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        Solution sol = new Solution();
        int[][] result = sol.merge(arr);
        System.out.println("The mergered intervals is : ");
        for(int i=0;i<result.length;i++)
        {
            for(int j= 0;j<result[0].length;j++)
            {
                System.out.print(result[i][j] + " ");
            }
        }
    }
}
