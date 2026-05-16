import java.util.*;
class Min_flip
{
    public static void main(String arg[])
    {
        Scanner scn= new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.minimumFlips(num);
        System.out.println("Minimum flips to change the string is: " +result);
    }
}
class Solution {
    public int minimumFlips(int n) {
        String bin=Integer.toBinaryString(n);
        int count=0;
        String rev=new StringBuilder(bin).reverse().toString();
        if(rev.equals(bin))
            return 0;
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)!=rev.charAt(i))
            {
                count++;
            }
        }
        return count;
    }
}
/*for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)=='0')
            {
                count++;
            }
            else
                if(bin.charAt(i)=='1')
                {
                    count++;
                }
        }
*/