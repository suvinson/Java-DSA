import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> str = new Stack<>();
        for( char c : s.toCharArray())
        {
            if(c =='(' || c =='{' || c =='[')
            {
                str.push(c);
            }
            else
            {
                if(str.isEmpty() && c == ')' || str.isEmpty() && c == ']' || str.isEmpty() && c == '}')
                    return false;
                if(!str.isEmpty())
                {
                    if(c ==')' && str.peek() =='(' || c =='}' && str.peek() =='{' || c ==']' && str.peek() =='[')
                    {
                        str.pop();
                    }
                    else
                        return false;
                }
            }
        }
        if(!str.isEmpty())
        {
            return false;
        }
        return true;
    }
}
public class Valid_parentheses {
    public static void main(String agr[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the brackets : ");
        String str = scn.next();
        Solution sol = new Solution();
        boolean result = sol.isValid(str);
        if(result)
        {
            System.out.println(str + " is a valid parentheses");
        }
        else
            System.out.println(str + " is not a valid parentheses");
    }
}
