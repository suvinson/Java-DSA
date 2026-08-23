import java.util.*;
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       //optimised code 
       int low = 0;
       int high = (matrix[0].length * matrix.length) - 1;
       int mid = 0;
       while(low <= high)
       {
            mid = (low + high) / 2;
            if(matrix[mid/matrix[0].length][mid % matrix[0].length] == target)
            {
                return true;
            }
            else if(matrix[mid/matrix[0].length][mid % matrix[0].length] > target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
       }
       return false;
       
       
        /* for(int i=0;i<matrix.length;i++)
        {
            if(search(matrix[i],target))
            {
                return true;
            }
        }
        return false; */
    }
    // O(n log m)
    /* private boolean search(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if(arr[mid] == target)
            {
                return true;
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return false;
    } */
}
public class Search_2D {
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
        System.out.println("Enter the target element : ");
        int target = scn.nextInt();
        Solution sol = new Solution();
        boolean ans = sol.searchMatrix(arr, target);
        if(ans)
        {
            System.out.println("The target is in the array ");
        }
        else
            System.out.println("The target is not in the array ");

    }
}
