import java.util.*;
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] arr = new int[grid.length * grid[0].length];
        int o=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                arr[o] = grid[i][j]; 
                o++;
            }
        } 
        for(int i=0;i<k;i++)
        {
            int last = arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--)
            {
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        int idx=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                grid[i][j] = arr[idx]; 
                idx++;
            }
        }
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<grid[0].length;j++)
            {
                row.add(grid[i][j]);
            }
            ls.add(row);
        }
        return ls;
    }
}
public class Shift_2D_grid {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the 2D array elements : ");
        int[][] arr = new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter the k times : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        List<List<Integer>> result = sol.shiftGrid(arr,k);
        System.out.println("The 2D shift : " + result);
    }
}
