import java.util.*;
class Solution {
    public int calculateScore(int a, int b) {
        String s1 = Integer.toBinaryString(a);
        String s2 = Integer.toBinaryString(b);

        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i) == '1')
            {
                count1++;
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i) == '1')
            {
                count2++;
            }
        }
        int ans = 0;
        if(count1 >= count2)
        {
            ans = count1 * count2;
        }
        else
        {
            ans = count2 / count1;
        }
        return ans;
    }
}
public class Binary_digit_score {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = scn.nextInt();
        System.out.println("Enter the second number : ");
        int b = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.calculateScore(a, b);
        System.out.println("Binary digit score is : " + ans);
    }
}
