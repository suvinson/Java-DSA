import java.util.*;
class Solution {
    public int minBitFlips(int start, int goal) {
        String f = Integer.toBinaryString(start);
        String s = Integer.toBinaryString(goal);
        int count = 0;
        int mini = Math.min(f.length(), s.length());
        int maxi = Math.max(f.length(), s.length());
        int diff = maxi - mini;
        for(int i=0;i<diff;i++)
        {
            if(f.length() > s.length())
            {
                s = "0" + s;
            }
            else
            {
                f = "0" + f;
            }
        }
        for(int i=0;i<Math.max(f.length(), s.length());i++)
        {
            if(f.charAt(i) != s.charAt(i))
            {
                count++;
            }
        }
        return count;
    }
}
public class Min_bit_flip {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the start number : ");
        int start  = scn.nextInt();
        System.out.println("Enter the goal number : ");
        int goal = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.minBitFlips(start, goal);
        System.out.println("Minimum Bit Flips to Convert Number is : " + ans);
    }
}
