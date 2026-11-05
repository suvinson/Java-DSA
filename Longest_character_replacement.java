import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        
        int maxfreq = 0, maxlength = 0;
        int l = 0,r = 0;
        int[] hash = new int[26];
        while(r < s.length())
        {
            hash[s.charAt(r) - 'A']++;
            maxfreq = Math.max(maxfreq, hash[s.charAt(r) - 'A']);

            if((r - l + 1) - maxfreq > k )
            {
                hash[s.charAt(l) - 'A']--;
                maxfreq = 0;
                l++;
            }
            if((r - l + 1) - maxfreq <= k)
            {
                maxlength = Math.max(maxlength, r - l + 1);
            }
            r++;
        }
        return maxlength;

    }
}
public class Longest_character_replacement {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string in capital letter : ");
        String s = scn.nextLine();
        System.out.println("Enter the kth element : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.characterReplacement(s, k);
        System.out.println("Longest Repeating Character Replacement is : " + ans);
    }
}
