import java.util.*;
/*class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> st = new HashSet<>();
        for(char c : word.toCharArray())
        {
            if(Character.isLowerCase(c))
            {
                for(int i=0;i<word.length();i++)
                {
                    if(word.charAt(i) == (Character.toUpperCase(c)))
                    {
                        st.add(c);
                    }
                }
            }
        }
        return st.size();
    }
}*/
class Solution{
    public int numberOfSpecialChars(String word) {
        Set<Character> st = new HashSet<>();
        int count=0;
        for(char c : word.toCharArray())
        {
            st.add(c);
        }
        int ans = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            if (st.contains(c) && st.contains((char) (c - 'a' + 'A'))) {
                ans++;
            }
        }
        return ans;
    }
}
public class Special_char {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scn.next();
        Solution sol = new Solution();
        int result = sol.numberOfSpecialChars(s);
        System.out.println("Number of Special Characters : " + result);
    }
}
