import java.util.*;
class Chess_board
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        String s;
        System.out.println("Enter the chess board cloumn number: ");  // eg: a1 , b4, d7.
        s=scn.nextLine();
        Solution sol=new Solution ();
        boolean result=sol.squareIsWhite(s);
        if(false)
        {
            System.out.println( s +" is a white column");
        }
        else
            System.out.println( s +" is a black column");
    }
}
class Solution {
    public boolean squareIsWhite(String c) {
        if(c.charAt(0)=='a' || c.charAt(0)=='c' || c.charAt(0)=='e' || c.charAt(0)=='g')
        {
            if(c.charAt(1)=='1' || c.charAt(1)=='3' || c.charAt(1)=='5' || c.charAt(1)=='7')
            {
                return false;
            }
        }
        else if(c.charAt(0)=='b' || c.charAt(0)=='d' || c.charAt(0)=='f' || c.charAt(0)=='h')
        {
            if(c.charAt(1)=='2' || c.charAt(1)=='4' || c.charAt(1)=='6' || c.charAt(1)=='8')
            {
                return false;
            }
        }

            return true;
    }
}