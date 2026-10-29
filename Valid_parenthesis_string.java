import java.util.*;
class Solution {
    public boolean checkValidString(String s) {
        int min = 0;
        int max = 0;
        
        for( int i=0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                min++;
                max++;
            }
            else if(s.charAt(i) == ')')
            {
                min--;
                max--;
            }
            else
            {
                min--;
                max++;
            }
            if(min < 0) min = 0;
            if(max < 0) return false;
        }
        return (min == 0);
    }
}

public class Valid_parenthesis_string {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string using only '(,),*' : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        boolean  ans = sol.checkValidString(s);
        if(ans)
        {
            System.out.println("The string is valid ");
        }
        else
        {
            System.out.println("The string is invalid ");
        }
    }
}
