import java.util.*;
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] arr = new int[matrix[0].length];
        int ans = 0 ; 
        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int j = 0 ; j < matrix[0].length ; j++)
            {
                if(matrix[i][j] == '1')
                    arr[j]++;
                else
                    arr[j] = 0;
            }
            int an = check(arr);
            ans = Math.max(ans , an);
        }
        return ans;
    }
    private int check(int[] arr)
    {
        int ans = 0;
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i <= arr.length ; i++)
        {
            int curr = (i == arr.length) ? 0 : arr[i];

            while(!stk.isEmpty() && arr[stk.peek()] >= curr)
            {
                int height = arr[stk.pop()];
                int width = stk.isEmpty() ? i : i - stk.peek() - 1;
                ans = Math.max(ans , height * width);
            }
            stk.push(i);
        }
        return ans;
    }
}
public class Maximal_rectangle {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int row = scn.nextInt();
        System.out.println("Enter the column size : ");
        int col = scn.nextInt();
        System.out.println("Enter the matrix elements using only '0' & '1' s : ");
        char[][] arr = new char[row][col];
        for(int i = 0 ; i < arr.length; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                arr[i][j] = scn.next().charAt(0);
            }
        }
        Solution sol = new Solution();
        int ans = sol.maximalRectangle(arr);
        System.out.println("The maximal rectangle : " + ans);
    }
}
