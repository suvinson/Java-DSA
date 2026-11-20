import java.util.*;
class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = 0;
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i <= heights.length ; i++)
        {
            int currentHeight = (i == heights.length) ? 0 : heights[i];
            while(!stk.isEmpty() && heights[stk.peek()] >= currentHeight)
            {
                int height = heights[stk.pop()];
                int width = stk.isEmpty() ? i : i - stk.peek() - 1;
                ans = Math.max(ans, height * width);
            }
            stk.push(i);
        }
        return ans;
    }
    /* private int[] findNse(int[] heights)
    {
        Stack<Integer> stk = new Stack<>();
        int[] arr = new int[heights.length];
        for(int i = heights.length - 1 ; i >= 0 ; i--)
        {
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i])
            {
                stk.pop();
            }
            arr[i] = stk.isEmpty() ? heights.length : stk.peek();
            stk.push(i);
        }
        return arr;
    }
    private int[] findPse(int[] heights)
    {
        Stack<Integer> stk = new Stack<>();
        int[] arr = new int[heights.length];
        for(int i = 0 ; i < heights.length ; i++)
        {
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i])
            {
                stk.pop();
            }
            arr[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        return arr;
    } */
}
public class Largest_rectangle_histogram {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements as histograms : ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.largestRectangleArea(arr);
        System.out.println("The Largest rectangle histogram is : " + ans);
    }
}
