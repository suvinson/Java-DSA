import java.util.Scanner;
class Solution {
    public char processStr(String s, long k) {
        long len = 0;
        for(char ch : s.toCharArray())
        {
            if(ch <= 'z' && ch!='*' && ch!='#' && ch!='%')
            {
                len++;
            }
            else if(ch == '*' && len >=1)
            {
                len--;
            }
            else if(ch == '#')
            {
                len *=2;
            }
            else if(ch == '%')
            {
                len = len;
            }
        }
        if(k+1 > len)
        {
            return '.';
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case '*':
                    len++;
                    break;
                case '#':
                    if (k + 1 > (len + 1) / 2) {
                        k -= len / 2;
                    }
                    len = (len + 1) / 2;
                    break;
                case '%':
                    k = len - k - 1;
                    break;
                default:
                    if (k + 1 == len) {
                        return c;
                    }
                    len--;
                    break;
            }
        }
        return '.';
    }
}
public class Process_string_two {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("A '*' removes the last character from result, if it exists");
        System.out.println("A '#' duplicates the current result and appends it to itself");
        System.out.println("A '%' reverses the current result");
        System.out.println("Enter the String and include '*' '%' '#' ");
        String s = scn.nextLine();
        System.out.println("Enter the k element : ");
        long k = scn.nextLong();
        Solution sol = new Solution();
        char result = sol.processStr(s,k);
        System.out.println("Stirng after  processing the operations : " + result);
    }
}
