import java.util.*;
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i < num.length() ; i++)
        {
                while(!stk.isEmpty() && k > 0 && stk.peek() > num.charAt(i))
                {
                    stk.pop();
                    k = k - 1;
                }
            stk.add(num.charAt(i));
        }
        while(k > 0 && !stk.isEmpty())
        {
            stk.pop();
            k--;
        }
        StringBuilder s = new StringBuilder();
        while(!stk.isEmpty())
        {
            s.append(stk.pop());
        }
        s.reverse();
        while(s.length() > 0 && s.charAt(0) == '0')
        {
            s.deleteCharAt(0);
        }
        return s.length() == 0 ? "0" : s.toString();
    }
}
public class Remove_k_digits {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String num = scn.nextLine();
        System.out.println("Ener the kth elements to remove from the string : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        String ans = sol.removeKdigits(num, k);
        System.out.println("After removing k elements the smallest string is : " + ans);
    }
}
