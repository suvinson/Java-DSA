import java.util.*;
class Solution {
    public int largestInteger(int n, int s) {
        if(s>n*9)
            return -1;
        if(s==0)
            return 0;
        int ans = 0;
        /* for(int i=0 ; i <n ; i++)
            {
                for(int j=9 ; j >=0 ;j--)
                    {
                        int remain = s - j;
                        int remainingDigits = n - i - 1;
                        if(remain >= 0 && remain <= remainingDigits * 9)
                        {
                            ans = ans * 10 + j;
                            s = remain;
                            break;
                        }
                    }
            } */
           for(int i=0;i<n;i++)
           {
                int digit = Math.min(9,s);
                ans = ans * 10 + digit;
                s = s - digit;
           }
        return ans;
    }
}
public class Largest_digit_sum {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of the integer : ");
        int n = scn.nextInt();
        System.out.println("Enter the actual number : ");
        int s = scn.nextInt();
        Solution sol = new Solution();
        int result = sol.largestInteger(n, s);
        System.out.println("Largest Integer With Given Digit Sum : " + result);
    }
}
