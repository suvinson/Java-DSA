import java.util.*;
class Bin_cal
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        String n;
        System.out.println("Enter the boolean number: ");
        n=scn.next();
        Solution sol=new Solution();
        boolean result=sol.checkOnesSegment(n);
        System.out.println(result);
    }
}
class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
        /*for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='1' && s.charAt(i+1)=='1' )
            {
                return true;
            }
        }
            return false;*/
    }
}