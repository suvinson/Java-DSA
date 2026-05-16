import java.util.*;
class Two_dim
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int row,col;
        System.out.println("Enter the row size of the array : ");
        row=scn.nextInt();
        System.out.println("Enter the column size of the array : ");
        col=scn.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter the array values : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        Solution sol=new Solution ();
        int result[][]=sol.transpose(arr);
        System.out.println("Transpose matrix :");
        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result[0].length;j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class Solution {
    public int[][] transpose(int[][] matrix) {
        int arr[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                arr[j][i]=matrix[i][j];
            }
        }
        return arr;
    }
}