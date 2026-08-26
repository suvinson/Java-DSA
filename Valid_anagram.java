import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hs = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
        }
        int count = 0;
        for(int i=0;i<t.length();i++)
        {
            if(hs.containsKey(t.charAt(i)) && hs.get(t.charAt(i)) > 0)
            {
                hs.put(t.charAt(i),hs.get(t.charAt(i)) - 1);
                count++;
            }
            else
                return false;
        }
        if(count == s.length())
            return true;
        else
            return false;
    }
}
public class Valid_anagram {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String s = scn.nextLine();
        System.out.println("Enter the second string : ");
        String t = scn.nextLine();
        Solution sol = new Solution();
        boolean ans = sol.isAnagram(s, t);
        if(ans)
        {
            System.out.println("It is an Anagram");
        }
        else
            System.out.println("It is not an Anagram");
    }
}
