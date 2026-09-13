import java.util.*;
class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        for(int i=0;i<rowShift.length;i++)
        {
            if(rowShift[i]!=0)
            {
                shift(rowShift[i] % n,grid,i,n);
            }
        }
        for(int i=0;i<colShift.length;i++)
        {
            if(colShift[i]!=0)
            {
                shift_II(colShift[i] % n,grid,i,n);
            }
        }
        return grid;
    }
    private void shift(int k , int[][] grid,int row,int n)
    {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            int newPosition = (i - k + n) % n;
            arr[newPosition] = grid[row][i];
        }
        for(int i=0;i<n;i++)
        {
            grid[row][i] = arr[i];
        }
    }
    private void shift_II(int k , int[][] grid,int row,int n)
    {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            int newPosition = (i - k + n) % n;
            arr[newPosition] = grid[i][row];
        }
        for(int i=0;i<n;i++)
        {
            grid[i][row] = arr[i];
        }
    }
}
class Cyclically_shift{
public static void main(String arg[])
{
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the length of grid and the rowCol shifts : ");
    int n = scn.nextInt();
    System.out.println("Enter the grid values : ");
    int[][] grid = new int[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            grid[i][j] = scn.nextInt();
        }
    }
    System.out.println("Enter the row Shift : ");
    int[] rowShift = new int[n];
    for(int i=0;i<n;i++)
    {
        rowShift[i] = scn.nextInt();
    }
    System.out.println("Enter the column Shift : ");
    int[] colShift = new int[n];
    for(int i=0;i<n;i++)
    {
        colShift[i] = scn.nextInt();
    }
    Solution sol = new Solution();
    int[][] ans = sol.cyclicShift(n, grid, rowShift, colShift);
    System.out.println("After shifting : ");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(grid[i][j] + " ");
        }
        System.out.println();
    }
}
}