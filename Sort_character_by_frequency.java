import java.util.*;
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
        }
        Character[] chars = hs.keySet().toArray(new Character[0]);
        Arrays.sort(chars, (a, b) -> hs.get(b) - hs.get(a));
        String ans = "";
        for(char ch : chars)
        {
            for(int j = 0; j < hs.get(ch); j++)
            {
                ans += ch;
            }
        }
        return ans;
    }
}
public class Sort_character_by_frequency {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        String ans = sol.frequencySort(s);
        System.out.println("The string is in highest frequency order : " + ans);
    }
}
