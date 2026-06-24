import java.util.*;
class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int d = k;
        for(int i = 0 ; i<s.length();i++)
        {
            if(k>0)
            {
                sb.append(s.charAt(i));
                k--;
            }
            else 
                break;
        }
        sb.reverse();
        for(int i=d;i<s.length();i++)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
public class Reverse_string_prefix {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string value : ");
        String s = scn.nextLine();
        System.out.println("Enter the k of number to reverse the string : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        String result = sol.reversePrefix(s,k);
        System.out.println("After reversing the string until k : " + result);
    }
}
