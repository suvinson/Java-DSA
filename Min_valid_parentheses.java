import java.util.*;
class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> stk = new ArrayDeque<>();
        //Stack<Integer> stk = new Stack<>();
        char[] c = s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(c[i] == '(')
            {
                stk.push(i);
            }
            else if(!stk.isEmpty()  && c[i] == ')')
            {
                stk.pop();
            }
            else if(c[i] ==')')
            {
                c[i] = '1';
            }
        }
        while(!stk.isEmpty())
        {
            int idx = stk.pop();
            c[idx] = '1';
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : c)
        {
            if(ch!='1')
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

public class Min_valid_parentheses {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string element : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        String result = sol.minRemoveToMakeValid(s);
        System.out.println("After removing the extra parantheses : " + result);
    }
}
