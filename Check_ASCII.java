import java.util.*;
class Solution {
    public boolean isPalindromic(String s) {
        String ans = "";
        for(int i=0;i<s.length();i++)
        {
            int ascii = (int) s.charAt(i);
            String binary = Integer.toBinaryString(ascii);
            if(binary.length() < 8)
            {
                for(int j=0;j < 8 - binary.length();j++)
                    {
                        binary = '0' + binary;
                    }
            }
            ans += binary;
        }
        String rev = new StringBuilder(ans).reverse().toString();
        if(rev.equals(ans))
            return true;
        else
            return false;
        
    }
}
public class Check_ASCII {
   public static void main(String arg[])
   {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string value : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        boolean ans = sol.isPalindromic(s);
        if(ans)
        {
            System.out.println("The string is a ASCII palindrome ");
        }
        else
        {
            System.out.println("The string is not a ASCII palindrome ");
        }
   } 
}
