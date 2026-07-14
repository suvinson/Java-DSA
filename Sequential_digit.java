import java.util.*;
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ls = new ArrayList<>();
        for(int i=1;i<=9;i++)
        {
            int num = 0;
            for(int j=i;j<=9;j++)
            {
                num = num * 10 + j;
                if(num>=low && num<=high)
                {
                    ls.add(num);
                }
            }
        }
        Collections.sort(ls);
        return ls;
    }
}
public class Sequential_digit {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the low value : ");
        int low = scn.nextInt();
        System.out.println("Enter the high value : ");
        int high = scn.nextInt();
        Solution sol = new Solution();
        List<Integer> ans = sol.sequentialDigits(low, high);
        System.out.println("Sequential digits are : " + ans);
    }
}
