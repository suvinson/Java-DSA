import java.util.*;
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0];
        int x2 = rec1[2];
        int y1 = rec1[1];
        int y2 = rec1[3];

        int a1 = rec2[0];
        int a2 = rec2[2];
        int b1 = rec2[1];
        int b2 = rec2[3];

        int left = Math.max(x1, a1);
        int right = Math.min(x2, a2);

        int width = right - left;

        int bottom = Math.max(y1, b1);
        int top = Math.min(y2, b2);

        int height = top - bottom;

        if((width > 0) && (height > 0))
        {
            return true;
        }
        else
            return false;
    }
}
public class Rectangle_Overlap {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first rectangle's four values : ");
        int n = 4;
        int[] rec1 = new int[n];
        for(int i=0;i<n;i++)
        {
            rec1[i] = scn.nextInt();
        }
        System.out.println("Enter the second rectangle's four values : ");
        int[] rec2 = new int[n];
        for(int i=0;i<n;i++)
        {
            rec2[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        boolean ans = sol.isRectangleOverlap(rec1, rec2);
        if(ans)
        {
            System.out.println("The Rectangle is Overlaping ");
        }
        else
            System.out.println("The Rectangle is not Overlaping ");
    }
}
