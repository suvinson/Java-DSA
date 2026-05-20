import java.util.*;
class Solution {
    public int calPoints(String[] s) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<s.length;i++)
        {
            if(s[i].equals("+"))
            {
                int temp = stk.peek();
                stk.pop();
                int val=stk.peek()+temp;
                stk.push(temp);
                stk.push(val);
            }
            else if(s[i].equals("C"))
            {
                stk.pop();
            }
            else if(s[i].equals("D"))
            {
                int prev = stk.peek();
                stk.push(prev*2);
            }
            else{
                stk.push(Integer.parseInt(s[i]));
            }
        }
        int sum =0;
        while(!stk.isEmpty())
        {
            sum +=stk.pop();
        }
        return sum;
    }
}
public class Base_ball_game {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Base ball game");
        System.out.println("A new integer Record a new score of x.");
        System.out.println("'+' Record a new score that is the sum of the previous two scores.");
        System.out.println("'D' Record a new score that is the double of the previous score.");
        System.out.println("'C' Invalidate the previous score, removing it from the record.");
        System.out.println("Enter the size of the array : ");
        int n = scn.nextInt();
        System.out.println("Enter the array values : ");
        String[] arr = new String[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = scn.next();
        }
        Solution sol = new Solution();
        int result = sol.calPoints(arr);
        System.out.println("Total sum of the score is : " + result);
    }
}
