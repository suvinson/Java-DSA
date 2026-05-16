import java.util.*;
class Largest_odd
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        String s;
        System.out.println("Enter the number: ");
        s=scn.nextLine();
        Solution sol=new Solution();
        String str=sol.largestOddNumber(s);
        System.out.println(str);
    }
}
class Solution {
    public String largestOddNumber(String num) {

        for(int i = num.length() - 1; i >= 0; i--) {

            int digit = num.charAt(i) - '0';   

            if(digit % 2 == 1) {              
                return num.substring(0, i + 1);
            }
        }
        return "";   
    }
}
 