import java.util.*;
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] str1 = startTime.split(":");
        String[] str2 = endTime.split(":");
        int[] num1 = new int[str1.length];
        int[] num2 = new int[str2.length];
        for(int i=0;i<str1.length;i++)
        {
            num1[i] = Integer.parseInt(str1[i]);
            num2[i] = Integer.parseInt(str2[i]);
        }
        num1[0] *= 3600;
        num2[0] *= 3600;
        num1[1] *= 60;
        num2[1] *= 60;

        int ans = 0;
        ans += (num2[0] -num1[0]) + (num2[1] -num1[1]) + (num2[2] -num1[2]);
        return ans;
    }
}
public class Elapsed_second {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the start time in HH:MM:SS format : ");
        String startTime = scn.nextLine();
        System.out.println("Enter the end time in HH:MM:SS format : ");
        String endTime = scn.nextLine();
        Solution sol = new Solution();
        int result = sol.secondsBetweenTimes(startTime, endTime);
        System.out.println("Number of Elapsed Seconds Between Two Times : " + result );
    }
}
