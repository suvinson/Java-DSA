import java.util.*;
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(num == 1 && sum > 9)
            return "";
        
        if(sum > 9 * num)
        {
            return "";
        }
        ArrayList<Integer> arr = new ArrayList<>();
        int k = 9;
        while(true)
        {
            if(sum - k >=0 && num > 0)
            {
                arr.add(k);
                sum = sum - k;
                num -= 1;
            }
            else
            {
                k = k-1;
            }
            if(sum == 0 && num == 0)
            {
                break;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<arr.size();i++)
        {
            ans = ans.append(arr.get(i));
        }
        return ans.toString();
    }
}
public class Maximise_sum_square {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the num :");
        int num = scn.nextInt();
        System.out.println("Enter the sum : ");
        int sum = scn.nextInt();
        Solution sol = new Solution();
        String ans = sol.maxSumOfSquares(num, sum);
        System.out.println("Maximize Sum of Squares of Digits : " + ans);
    }
}
