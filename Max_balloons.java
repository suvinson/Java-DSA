import java.util.*;
class Solution {
    public int maxNumberOfBalloons(String text) {
        int bcount = 0;
        int acount = 0;
        int lcount = 0;
        int ocount = 0;
        int ncount = 0;
        for(char ch : text.toCharArray())
        {
            if(ch =='b') 
            {
                bcount++;
            }
            else if(ch =='a')
            {
                acount++;
            }
            else if(ch =='l')
            {
                lcount++;
            }
            else if(ch=='o')
            {
                ocount++;
            }
            else if(ch == 'n')
            {
                ncount++;
            }
        }
        lcount /=2;
        ocount /=2;
        int result = Math.min(bcount,acount);
        result = Math.min(result,lcount);
        result = Math.min(result,ocount);
        return Math.min(result , ncount);
    }
}
public class Max_balloons {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string with ' b a l l o o n s letter': ");
        String text = scn.nextLine();
        Solution sol = new Solution();
        int result = sol.maxNumberOfBalloons(text);
        System.out.println("you can make " + result + " balloons");
    }
}
