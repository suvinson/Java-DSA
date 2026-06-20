import java.util.*;
class Solution {
    public String[] createGrid(int m, int n) {
        String[] s = new String[m];
        for(int i=0;i<m;i++)
        {
            if(i==0)
            {
                s[i] = ".".repeat(n);
            }
            else if(i>0)
            {
                s[i] = "#".repeat(n-1) + ".";
            }
        }
        return s;
    }
}
public class Grid {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int m = scn.nextInt();
        System.out.println("Enter the column size : ");
        int n = scn.nextInt();
        Solution sol = new Solution();
        String[] result = sol.createGrid(m, n);
        System.out.println("The Grid is in this form : ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
