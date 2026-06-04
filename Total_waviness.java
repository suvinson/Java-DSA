import java.util.*;
class Solution {
    public int totalWaviness(int num1, int num2) {
        if(num1 /10 <=1 && num2 /10 <=1)
        {
            return 0;
        }
        int sum =0;
        for(int num = num1; num <= num2; num++)
        {
            char[] digits = String.valueOf(num).toCharArray();
            for(int i=1; i<digits.length-1;i++)
            {
                if(digits[i]>digits[i-1] && digits[i]>digits[i+1])
                {
                    sum +=1;
                }
                else if(digits[i]<digits[i-1] && digits[i]<digits[i+1])
                {
                    sum +=1;
                }
            }
        }
        return sum ;
    }
}
public class Total_waviness {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = scn.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = scn.nextInt();
        Solution sol = new Solution();
        int result = sol.totalWaviness(num1,num2);
        System.out.println("The total waviness is : " + result);
    }
}
