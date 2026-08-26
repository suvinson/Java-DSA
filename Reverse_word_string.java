import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String sd = "";
        for (int i = words.length - 1; i >= 0; i--) 
        {
            sd += words[i];
            if(i != 0)
                sd += " ";
        }
        return sd;
    }
}
public class Reverse_word_string {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string  : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        String ans = sol.reverseWords(s);
        System.out.println("The string in reverse order : " + ans);
    }
}
