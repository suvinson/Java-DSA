import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0 , right = m-1;
        int top = 0 , bottom = n-1;
        while(top <= bottom && left <= right )
        {
            for(int i=left ; i<= right ;i++)
            {
                ans.add(matrix[top][i]);
            }
            top++;

            for(int i=top ; i<=bottom;i++)
            {
                ans.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom)
            {
                for(int i=right; i>=left ;i--)
                {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right)
            {
                for(int i=bottom; i>=top ;i--)
                {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
public class Spiral_matrix {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
         System.out.println("Enter the matrix row size : ");
        int row = scn.nextInt();
        System.out.println("Enter the matrix column size : ");
        int col = scn.nextInt();
        System.out.println("Enter the matrix elements : ");
        int[][] matrix = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j] = scn.nextInt();
            }
        }
        Solution sol = new Solution();
        List<Integer> result = sol.spiralOrder(matrix);
        System.out.println("The spiral matrix : " + result );
    }
}
