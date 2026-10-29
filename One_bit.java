import java.util.*;
class Solution {
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == '1')
            {
                count++;
            }
        }
        return count;
    }
}
public class One_bit {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.hammingWeight(n);
        System.out.println("Number of 1 Bits are : " + ans);
    }
}
