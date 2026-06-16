import java.util.*;
class Solution {
    public String processStr(String s) {
        String result = "";
        for(char ch : s.toCharArray())
        {
            if(ch <= 'z' && ch!='*' && ch!='%' && ch!='#')
            {
                result +=ch;
            }
            else if(ch == '*' && result.length()>=1)
            {
                String res = result;
                res =  res.substring(0,result.length()-1);
                result = res;
            }
            else if(ch == '%')
            {
                result = new StringBuilder(result).reverse().toString();
            }
            else if(ch =='#')
            {
                String duplicate = result;
                result +=duplicate;
            }
        }
        return result;
    }
}
public class Process_string {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("A '*' removes the last character from result, if it exists");
        System.out.println("A '#' duplicates the current result and appends it to itself");
        System.out.println("A '%' reverses the current result");
        System.out.println("Enter the String and include '*' '%' '#' ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        String result = sol.processStr(s);
        System.out.println("Stirng after  processing the operations : " + result);
    }
}
