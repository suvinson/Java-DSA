import java.util.*;
class Solution {
    public int countValidPrefixes(String s) {
        int count =0;
        int zeroCount = 0;
        int oneCount = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '0')
            {
                zeroCount++;
            }
            else
                oneCount++;
            if(Math.abs(zeroCount - oneCount) <= 1)    
                count++;
        }
        return count;
    }
}
public class Count_prefix {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string only consisting of '0' and '1' : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        int result = sol.countValidPrefixes(s);
        System.out.println("Enter total count of valid prefix is : " + result);
    }
}
