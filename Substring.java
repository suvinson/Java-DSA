import java.util.*;
class Solution {
    public int numberOfSubstrings(String s) {
        /*int count = 0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String sub = s.substring(i,j+1);
                if(sub.contains("a") && sub.contains("b") && sub.contains("c"))
                {
                    count++;
                }
            }
        }
        return count;*/
        
        int count = 0;
        int a = -1;
        int b = -1;
        int c = -1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch =='a')
            {
                a=i;
            }
            else if(ch =='b')
            {
                b=i;
            }
            else 
            {
                c=i;
            }

            min = Math.min(a,Math.min(b,c));
            if(a>=0 && b>=0 && c>=0)
            {
                count +=(1+min);
            }
        }
        return count;
    }
}
public class Substring {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = scn.next();
        Solution sol = new Solution();
        int result = sol.numberOfSubstrings(s);
        System.out.println("Number of Substrings Containing All Three Characters is : " + result);
    }
}
