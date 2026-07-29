import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[grid.length*grid[0].length];
        int k=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                arr[k] = grid[i][j];
                k++;
            }
        }
        Arrays.sort(arr);
        int miss =0 ;
        int repeat = 0;
        for(int i=1;i<=grid.length*grid[0].length;i++)
        {
            int count =0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j] == i)
                {
                    count++;
                }
            }
            if(count == 2)
                {
                    repeat = i;
                }
                if(count == 0)
                {
                    miss = i;
                }
        }
        int[] ar = new int[2];
        ar[0] = repeat;
        ar[1] = miss;
        return ar;
    }
}
public class Missing_repeated {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int row = scn.nextInt();
        System.out.println("Enter the col size : ");
        int col = scn.nextInt();
        System.out.println("Enter the matrix element : ");
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        Solution sol = new Solution();
        int[] result = sol.findMissingAndRepeatedValues(arr);
        System.out.println("The repeated number : " + result[0]);
        System.out.println("The missed number : " + result[1]);
    }
}
