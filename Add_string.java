import java.util.*;
class Add_string
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        String n1,n2;
        System.out.println("Enter two string values in numbers: ");
        n1=scn.nextLine();
        n2=scn.nextLine();
        Solution sol= new Solution();
        String result= sol.addStrings(n1,n2);
        System.out.println("The addition of two strings : "+ result);
    }
}
class Solution {
    public String addStrings(String num1, String num2) {
        int carry=0;
        int total=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        StringBuilder sum = new StringBuilder();
        while(i>=0 || j>=0)
        {
            int n1=0,n2=0;
            if(i>=0)
                n1=num1.charAt(i)-'0';
            if(j>=0)
                n2=num2.charAt(j)-'0';
            total=n1+n2+carry;
            sum.append(total % 10);
            carry=total/10;
            i--;
            j--;
        }
        if (carry > 0)      // what if 99 + 1 = Step 1 → 9+1=10 → write 0 carry 1
             sum.append(carry);              // Step 2 → 9+0+1=10 → write 0 carry 1
        return sum.reverse().toString();
    }
}
 