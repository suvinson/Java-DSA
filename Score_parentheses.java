import java.util.*;
class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        int score = 0;
        for(char i : s.toCharArray())
        {
            if(i == '(')
            {
                stk.push(score);
                score = 0;
            }
            else
            {
                score = stk.pop() + Math.max(score * 2 , 1);
            }
        }
        return score;
    }
}
public class Score_parentheses {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string of parentheses : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        int result = sol.scoreOfParentheses(s);
        System.out.println("The score of the parentheses is : " + result);
    }
}
