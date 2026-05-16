import java.util.*;
class RotateImage
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int n1 , n2 ;
        System.out.println("Enter the number of row : ");
        n1 = scn.nextInt();
        System.out.println("Enter the number of column : ");
        n2 = scn.nextInt();
        int arr[][] = new int[n1][n2];
        System.out.println("Enter the matrix elements : ");
        for(int i=0 ;i<n1;i++)
        {
            for(int j=0 ;j<n2;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        Solution sol = new Solution();
        sol.rotate(arr);
        System.out.println("Rotated image : ");
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0 ; i<matrix.length; i++)
        {
            for(int j=i+1 ; j<matrix[0].length ;j++)
            {
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = temp;
            }
        }
        for(int i=0 ;i<matrix.length;i++)
        {
            int start = 0;
            int end = matrix[0].length-1;
            while(start<end)
            {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}