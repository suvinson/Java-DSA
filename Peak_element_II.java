import java.util.*;
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = m - 1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            int MaxRowIndex = searchIndex(mat,n,m,mid);
            int left = mid - 1 >= 0 ? mat[MaxRowIndex][mid - 1] : -1;
            int right = mid + 1 < m ? mat[MaxRowIndex][mid + 1] : -1;
            if(mat[MaxRowIndex][mid] > left && mat[MaxRowIndex][mid] > right)
            {
                return new int[]{MaxRowIndex,mid};
            }
            else if(mat[MaxRowIndex][mid] < left)
            {
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return new int[]{-1,-1};
    }
    private int searchIndex(int[][] mat, int n , int m , int col)
    {
        int maxIndex = -1;
        int index = -1;
        for(int i=0;i<mat.length;i++)
        {
            if(mat[i][col] > maxIndex)
            {
                maxIndex = mat[i][col];
                index = i;
            }
        }
        return index;
    }
}
public class Peak_element_II {
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
        int[] ans = sol.findPeakGrid(arr);
        System.out.println("The peak element's index is : " + " [" + ans[0] + "," + ans[1] + "]");
    }
}
