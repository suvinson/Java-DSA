import java.util.*;
class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long ans_1 = 0;
        long ans_2 = 0;
        for(int i=0;i<source.length;i++)
        {
            ans_1 += source[i];
            ans_2 += target[i];
        }
        if(ans_1 == ans_2)
            return true;
        else
            return false;
    }
}
public class Transform_array {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the source array  : ");
        int n = scn.nextInt();
        System.out.println("Enter the source array elements : ");
        int[] source = new int[n];
        for(int i=0;i<source.length;i++)
        {
            source[i] = scn.nextInt();
        }
        System.out.println("Enter the target elements : ");
        int[] target = new int[n];
        for(int i=0;i<target.length;i++)
        {
            target[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        boolean ans = sol.canTransform(source, target);
        if(ans)
        {
            System.out.println("The target array can be achieveable");
        }
        else
            System.out.println("The target array cannot be achieveable");
    }
}
