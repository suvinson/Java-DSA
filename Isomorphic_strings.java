import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        for(int i=0;i<s.length();i++)
        {
            if(m1[s.charAt(i)] != m2[t.charAt(i)])
                return false;
            
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
public class Isomorphic_strings {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String s = scn.nextLine();
        System.out.println("Enter the second string : ");
        String t = scn.nextLine();
        Solution sol = new Solution();
        boolean ans = sol.isIsomorphic(s, t);
        if(ans)
        {
            System.out.println("It is an Isomorphic Strings");
        }
        else
            System.out.println("It is not an Isomorphic Strings");
    }
}
